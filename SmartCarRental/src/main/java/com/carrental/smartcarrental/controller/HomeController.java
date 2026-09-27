package com.carrental.smartcarrental.controller;

import com.carrental.smartcarrental.model.Booking;
import com.carrental.smartcarrental.repository.BookingRepository;
import com.carrental.smartcarrental.service.CarService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

@Controller
public class HomeController {
    private final CarService carService;
    private final BookingRepository bookingRepository;
    private final Path uploadDir=Paths.get("uploads").toAbsolutePath().normalize();

    public HomeController(CarService carService, BookingRepository bookingRepository){this.carService=carService;this.bookingRepository=bookingRepository;}

    @GetMapping({"/","/home"}) public String home(Model model){ model.addAttribute("title","SmartCarRental"); return "index"; }

    @PostMapping("/step1") public String step1(@RequestParam String rentalType,HttpSession s){s.setAttribute("rentalType",rentalType);return "redirect:/step2";}
    @GetMapping("/step2") public String step2(Model m,HttpSession s){m.addAttribute("rentalType",s.getAttribute("rentalType"));return "step2";}
    @PostMapping("/step2") public String saveStep2(@RequestParam String name,@RequestParam String phone,@RequestParam int members,@RequestParam String location,@RequestParam String destination,HttpSession s){
        s.setAttribute("name",name);s.setAttribute("phone",phone);s.setAttribute("members",members);s.setAttribute("location",location);s.setAttribute("destination",destination);return "redirect:/step3";
    }
    @GetMapping("/step3") public String step3(Model m,HttpSession s){String loc=(String)s.getAttribute("location");m.addAttribute("location",loc);m.addAttribute("cars",carService.find(loc,(String)s.getAttribute("rentalType")));return "step3";}
    @PostMapping("/step3") public String saveStep3(@RequestParam long carId,HttpSession s){var car=carService.get(carId);s.setAttribute("carId",car.id());s.setAttribute("carName",car.name());s.setAttribute("price",car.pricePerDay());return "redirect:/step4";}
    @GetMapping("/step4") public String step4(Model m,HttpSession s){m.addAttribute("car",carService.get((Long)s.getAttribute("carId")));m.addAttribute("destination",s.getAttribute("destination"));return "step4";}
    @PostMapping("/step4") public String saveStep4(@RequestParam int days,@RequestParam double toll,@RequestParam double fuel,HttpSession s){double base=(double)s.getAttribute("price")*days;double total=base+toll+fuel;s.setAttribute("days",days);s.setAttribute("toll",toll);s.setAttribute("fuel",fuel);s.setAttribute("total",total);return "redirect:/step5";}
    @GetMapping("/step5") public String step5(){return "step5";}
    @PostMapping("/step5") public String uploadInspection(@RequestParam(required=false) MultipartFile[] files,HttpSession s,RedirectAttributes ra){
        try{Files.createDirectories(uploadDir);int count=0;if(files!=null)for(MultipartFile f:files){if(f.isEmpty())continue;String name=UUID.randomUUID()+"_"+Paths.get(f.getOriginalFilename()==null?"inspection":f.getOriginalFilename()).getFileName();Files.copy(f.getInputStream(),uploadDir.resolve(name),StandardCopyOption.REPLACE_EXISTING);count++;}s.setAttribute("inspectionCount",count);ra.addFlashAttribute("uploadMessage",count+" inspection file(s) uploaded successfully.");return "redirect:/step6";}catch(IOException e){ra.addFlashAttribute("uploadMessage","Upload failed. Please try again.");return "redirect:/step5";}}
    @GetMapping("/step6") public String step6(Model m,HttpSession s){m.addAttribute("destination",s.getAttribute("destination"));m.addAttribute("location",s.getAttribute("location"));return "step6";}
    @PostMapping("/step6") public String step6Post(HttpSession s){s.setAttribute("tripStatus","Trip completed / ready for return inspection");return "redirect:/step7";}
    @GetMapping("/step7") public String step7(Model m,HttpSession s){m.addAttribute("carName",s.getAttribute("carName"));return "step7";}
    @PostMapping("/step7") public String step7Post(@RequestParam String report,@RequestParam String damage,HttpSession s){
        s.setAttribute("returnReport",report);s.setAttribute("damage",damage);return "redirect:/step8";}
    @GetMapping("/step8") public String step8(Model m,HttpSession s){m.addAttribute("carName",s.getAttribute("carName"));m.addAttribute("total",s.getAttribute("total"));return "step8";}
    @PostMapping("/step8") public String step8Post(@RequestParam int rating,@RequestParam String review,HttpSession s){
        Booking b=new Booking((String)s.getAttribute("rentalType"),(String)s.getAttribute("name"),(String)s.getAttribute("phone"),(String)s.getAttribute("location"),(String)s.getAttribute("destination"),(Integer)s.getAttribute("members"),(String)s.getAttribute("carName"),(Double)s.getAttribute("total"),"COMPLETED");bookingRepository.save(b);s.invalidate();return "redirect:/?success=1";}
    @PostMapping("/report") public String report(@RequestParam String issue,HttpSession s,RedirectAttributes ra){ra.addFlashAttribute("message","Report submitted successfully. Thank you for helping keep SmartCarRental safe.");s.invalidate();return "redirect:/";}
    @GetMapping("/bookings") public String bookings(Model m){m.addAttribute("bookings",bookingRepository.findAll());return "bookings";}
}

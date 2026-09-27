package com.carrental.smartcarrental.service;

import com.carrental.smartcarrental.model.Car;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> cars = List.of(
        new Car(1,"Toyota Innova Crysta","SUV","Chennai","Automatic",7,2800,"https://images.unsplash.com/photo-1549317661-bd32c8ce0db2?auto=format&fit=crop&w=900&q=85",true),
        new Car(2,"Hyundai Creta","SUV","Chennai","Automatic",5,2200,"https://images.unsplash.com/photo-1551830820-330a71b99659?auto=format&fit=crop&w=900&q=85",true),
        new Car(3,"Maruti Suzuki Ertiga","MUV","Chennai","Manual",7,1900,"https://images.unsplash.com/photo-1533473359331-0135ef1b58bf?auto=format&fit=crop&w=900&q=85",true),
        new Car(4,"Kia Seltos","SUV","Bengaluru","Automatic",5,2400,"https://images.unsplash.com/photo-1619767886558-efdc259cde1a?auto=format&fit=crop&w=900&q=85",true),
        new Car(5,"Honda City","Sedan","Bengaluru","Automatic",5,2100,"https://images.unsplash.com/photo-1552519507-da3b142c6e3d?auto=format&fit=crop&w=900&q=85",true),
        new Car(6,"Tata Nexon","SUV","Coimbatore","Manual",5,1800,"https://images.unsplash.com/photo-1542362567-b07e54358753?auto=format&fit=crop&w=900&q=85",true),
        new Car(7,"Mahindra XUV700","SUV","Hyderabad","Automatic",7,3200,"https://images.unsplash.com/photo-1503376780353-7e6692767b70?auto=format&fit=crop&w=900&q=85",true),
        new Car(8,"Toyota Fortuner","Premium SUV","Chennai","Automatic",7,4500,"https://images.unsplash.com/photo-1553440569-bcc63803a83d?auto=format&fit=crop&w=900&q=85",true),
        new Car(9,"BMW 3 Series","Luxury Sedan","Chennai","Automatic",5,6500,"https://images.unsplash.com/photo-1555215695-3004980ad54e?auto=format&fit=crop&w=900&q=85",true),
        new Car(10,"Mercedes-Benz C-Class","Luxury Sedan","Bengaluru","Automatic",5,7200,"https://images.unsplash.com/photo-1618843479313-40f8afb4b4d8?auto=format&fit=crop&w=900&q=85",true)
    );
    public List<Car> find(String location, String rentalType){
        if(location==null || location.isBlank()) return cars;
        String l=location.toLowerCase();
        List<Car> exact=cars.stream().filter(c->c.location().toLowerCase().contains(l)).collect(Collectors.toList());
        return exact.isEmpty()?cars:exact;
    }
    public Car get(long id){ return cars.stream().filter(c->c.id()==id).findFirst().orElse(cars.get(0)); }
}

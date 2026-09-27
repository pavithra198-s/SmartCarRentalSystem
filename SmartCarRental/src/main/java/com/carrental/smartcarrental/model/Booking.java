package com.carrental.smartcarrental.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="bookings")
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rentalType;
    private String customerName;
    private String phone;
    private String pickupLocation;
    private String destination;
    private int members;
    private String carName;
    private double totalAmount;
    private String status;
    private LocalDateTime createdAt;

    public Booking() {}
    public Booking(String rentalType,String customerName,String phone,String pickupLocation,String destination,int members,String carName,double totalAmount,String status) {
        this.rentalType=rentalType; this.customerName=customerName; this.phone=phone; this.pickupLocation=pickupLocation; this.destination=destination; this.members=members; this.carName=carName; this.totalAmount=totalAmount; this.status=status; this.createdAt=LocalDateTime.now();
    }
    @PrePersist public void prePersist(){ if(createdAt==null) createdAt=LocalDateTime.now(); }
    public Long getId(){return id;} public String getRentalType(){return rentalType;} public String getCustomerName(){return customerName;} public String getPhone(){return phone;} public String getPickupLocation(){return pickupLocation;} public String getDestination(){return destination;} public int getMembers(){return members;} public String getCarName(){return carName;} public double getTotalAmount(){return totalAmount;} public String getStatus(){return status;} public LocalDateTime getCreatedAt(){return createdAt;}
    public void setRentalType(String v){rentalType=v;} public void setCustomerName(String v){customerName=v;} public void setPhone(String v){phone=v;} public void setPickupLocation(String v){pickupLocation=v;} public void setDestination(String v){destination=v;} public void setMembers(int v){members=v;} public void setCarName(String v){carName=v;} public void setTotalAmount(double v){totalAmount=v;} public void setStatus(String v){status=v;}
}

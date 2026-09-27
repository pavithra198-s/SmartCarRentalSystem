package com.carrental.smartcarrental.model;

public record Car(long id, String name, String type, String location, String transmission, int seats, double pricePerDay, String image, boolean available) {}

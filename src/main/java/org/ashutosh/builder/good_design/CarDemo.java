package org.ashutosh.builder.good_design;

public class CarDemo {
    public static void main(String[] args) {
        Car audi = new Car.CarBuilder("v16", 4).setCityDrive(true).build();
        System.out.println(audi);
    }
}

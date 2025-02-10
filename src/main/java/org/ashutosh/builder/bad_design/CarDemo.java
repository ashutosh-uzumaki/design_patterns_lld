package org.ashutosh.builder.bad_design;

public class CarDemo {
    public static void main(String[] args) {
        Car withoutSunroof = new Car("v8", 4, true);
        System.out.println(withoutSunroof);
    }

    //client  has  to send multiple combinations for the
}

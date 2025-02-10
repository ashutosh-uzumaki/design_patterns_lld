package org.ashutosh.factory.good_design;

public class Upi implements ProcessPayment{
    @Override
    public void makePayment(double amount) {
        System.out.println("amount is deducted: "+amount);
    }
}

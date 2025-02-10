package org.ashutosh.factory.bad_design;

public class Paypal implements ProcessPayment{
    @Override
    public void makePayment(double amount){
        System.out.println("amount is deducted: "+amount);
    }
}

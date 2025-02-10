package org.ashutosh.factory.bad_design;

public class FactoryDemo {
    public static void main(String[] args) {
        ProcessPayment processPayment = PaymentMethodFactory.getPaymentMethod("creditcard");
        processPayment.makePayment(900.00);
    }
}

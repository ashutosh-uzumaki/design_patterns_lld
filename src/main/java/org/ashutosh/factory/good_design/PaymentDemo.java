package org.ashutosh.factory.good_design;

public class PaymentDemo {
    public static void main(String[] args) {
        CreatePaymentMethodFactory creditCardFactory = new CreditCardFactory();
        ProcessPayment creditCard = creditCardFactory.createPaymentMethod();
        creditCard.makePayment(9000);
    }
}
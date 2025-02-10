package org.ashutosh.factory.bad_design;

public class PaymentMethodFactory {
    public static ProcessPayment getPaymentMethod(String paymentMethod){
        if(paymentMethod.toLowerCase().equalsIgnoreCase("creditcard")){
            return new CreditCard();
        }else if(paymentMethod.toLowerCase().equalsIgnoreCase("paypal")){
            return new Paypal();
        }else if(paymentMethod.toLowerCase().equalsIgnoreCase("upi")){
            return new Upi();
        }else{
            throw new IllegalArgumentException("Invalid Payment Method");
        }
    }
}

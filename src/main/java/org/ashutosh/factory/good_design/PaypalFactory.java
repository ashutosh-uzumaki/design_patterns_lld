package org.ashutosh.factory.good_design;

public class PaypalFactory implements CreatePaymentMethodFactory{
    @Override
    public ProcessPayment createPaymentMethod(){
        return new Paypal();
    }
}

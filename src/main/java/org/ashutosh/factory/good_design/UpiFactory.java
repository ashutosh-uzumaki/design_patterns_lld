package org.ashutosh.factory.good_design;

public class UpiFactory implements CreatePaymentMethodFactory{
    @Override
    public ProcessPayment createPaymentMethod(){
        return new Upi();
    }
}

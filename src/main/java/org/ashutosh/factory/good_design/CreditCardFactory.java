package org.ashutosh.factory.good_design;

public class CreditCardFactory implements CreatePaymentMethodFactory{
    @Override
    public ProcessPayment createPaymentMethod() {
        return new CreditCard();
    }
}

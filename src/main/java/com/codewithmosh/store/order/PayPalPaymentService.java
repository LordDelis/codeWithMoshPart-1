package com.codewithmosh.store.order;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("paypal")
@Primary
public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount paid is " + amount);
    }
}

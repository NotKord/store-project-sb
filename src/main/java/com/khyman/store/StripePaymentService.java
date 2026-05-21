package com.khyman.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment with Stripe...");
        System.out.println("Amount paid: $" + amount);
    }
}

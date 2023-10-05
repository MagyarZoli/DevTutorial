package org.example.pattern.structural;

import org.example.pattern.auxiliary.Payment;
import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.User2;

public class Decorator
        implements Payment {

    Payment payment;

    public Decorator(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void getPayment(float pay) {
        float premium = pay * 0.02F;
        if (payment instanceof User) {
            new User().getPayment(pay + (premium * 2));
        } else if (payment instanceof User2){
            new User2().getPayment(pay + premium);
        } else {
            System.out.println("null");
        }
    }
}
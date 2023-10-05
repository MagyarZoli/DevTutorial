package org.example.pattern.structural;

import org.example.pattern.auxiliary.Payment;
import org.example.pattern.auxiliary.User2;

public class Adapter
        implements Payment {

    User2 user2;

    public Adapter(User2 user2) {
        this.user2 = user2;
    }

    @Override
    public void getPayment(float pay) {
        System.out.println(pay + " > " + pay / 1.27);
    }
}
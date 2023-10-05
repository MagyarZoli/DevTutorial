package org.example.pattern.structural;

import org.example.pattern.auxiliary.Payment;

import java.util.List;

public class Facade {

    public void facade(List<Payment> list, float pay) {
        list.forEach((l) -> {
            System.out.println(l);
            l.getPayment(pay);
        });
    }
}
package org.example.pattern.structural;

import org.example.pattern.auxiliary.Payment;
import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.User2;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {

    Map<Integer, Payment> map = new HashMap<>();

    public Payment getPayment(int type) {
        Payment payment;
        if (map.containsKey(type)) {
            return map.get(type);
        } else {
             payment = (type == 0 ? new User() : new User2());
        }
        map.put(type, payment);
        return payment;
    }
}
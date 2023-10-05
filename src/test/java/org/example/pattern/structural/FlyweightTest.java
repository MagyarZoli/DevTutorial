package org.example.pattern.structural;

import org.example.pattern.auxiliary.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FlyweightTest {

    static List<Payment> list = new ArrayList<>();
    static Flyweight flyweight = new Flyweight();

    public static void main(String[] args) {
        Runnable createUser = new Runnable() {
            @Override
            public void run() {
                randomUser();
            }
        };
        Runnable removeUser = FlyweightTest::removeUser;
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(createUser, 0, 3, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(removeUser, 5, 5, TimeUnit.SECONDS);
    }

    private static void randomUser() {
        Random random = new Random();
        int randInt = random.nextInt(2);

        Payment payment = flyweight.getPayment(randInt);
        list.add(payment);

        list.forEach(l -> {
            System.out.println("create: "
                    + l.getClass().getSimpleName() + l.hashCode());
        });
    }

    private static void removeUser() {
        System.out.println("remove: "
                + list.get(0).getClass().getSimpleName() + list.get(0).hashCode());
    }
}
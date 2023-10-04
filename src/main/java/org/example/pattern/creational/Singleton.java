package org.example.pattern.creational;

import org.example.pattern.auxiliary.User;

public class Singleton extends User {

    private static User user;
    private static boolean initialized = false;

    private Singleton() {}

    public static User getInstance(User user) {
        if (initialized) {
            return Singleton.user;
        }
        Singleton.user = user;
        initialized = true;
        return Singleton.user;
    }
}
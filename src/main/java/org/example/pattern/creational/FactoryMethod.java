package org.example.pattern.creational;

import org.example.pattern.auxiliary.Person;
import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.User2;

import java.util.List;

public class FactoryMethod
        extends AbstractFactory{

    public Person getPerson(String type) {
        return switch (type.toLowerCase()) {
            case "user" -> new User();
            case "user2" -> new User2();
            default -> null;
        };
    }

    public List<Person> getPersonPackage(int count, String type) {
        Person person = getPerson(type);
        return person.makePersonPackage(count);
    }
}
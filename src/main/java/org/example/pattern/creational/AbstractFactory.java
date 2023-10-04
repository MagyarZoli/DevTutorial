package org.example.pattern.creational;

import org.example.pattern.auxiliary.Person;

import java.util.List;

public abstract class AbstractFactory {

    public abstract Person getPerson(String type);

    public abstract List<Person> getPersonPackage(int count, String type);
}
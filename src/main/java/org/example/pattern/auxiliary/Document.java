package org.example.pattern.auxiliary;

public interface Document {

    default void save() {
        System.out.println(this.getClass().getSimpleName() + ": Saving document...");
    }

    default void print() {
        System.out.println(this.getClass().getSimpleName() + ": Printing document...");
    }
}
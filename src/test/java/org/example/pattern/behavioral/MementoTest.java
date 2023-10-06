package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MementoTest
        extends UserTest
        implements BehavioralTest {

    private String text = "";
    private final Memento memento = new Memento(text);

    @Test
    @Override
    public void test() {
        write(" Hello");
        save();
        print();
        write(" World");
        print();
        undo();
        print();
    }

    private void write(String text) {
        this.text += text;
    }

    private void print() {
        System.out.println(text);
    }

    private void save() {
        memento.setState(text);
    }

    private void undo() {
        text = memento.getState();
    }
}
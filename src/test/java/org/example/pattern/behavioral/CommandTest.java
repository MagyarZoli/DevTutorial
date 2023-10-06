package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.Document;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest
        extends UserTest
        implements BehavioralTest {

    Document doc;
    Document doc2;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> doc = user);
        assertNotNull(doc);
        assertDoesNotThrow(() -> doc2 = user2);
        assertNotNull(doc2);
        user2.command(new Command.Sub2Command(doc));
        user.command(new Command.SubCommand(doc));
        user2.command(new Command.Sub2Command(doc2));
        user.command(new Command.SubCommand(doc2));
    }
}
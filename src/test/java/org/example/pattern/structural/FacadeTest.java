package org.example.pattern.structural;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FacadeTest
        extends UserTest {

    private Facade facade;

    @Test
    @Override
    public void test() {
        facade = new Facade();
        facade.facade(List.of(user, user, user2, user), 1_200.0F);
    }
}
package org.example.test.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTest {

    static BankAccount bankAccount = new BankAccount(0.0, 0.0);

    @Test
    @Order(2)
    public void test_assert_withdraw() {
        assertDoesNotThrow(() -> bankAccount.withdraw(300.0));
        assertEquals(200.0, bankAccount.getBalance());
    }

    @Test
    @Order(1)
    public void test_assert_deposit(){
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(500.0, bankAccount.getBalance());
    }
}
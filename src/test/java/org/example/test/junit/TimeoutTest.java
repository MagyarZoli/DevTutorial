package org.example.test.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

//@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
public class TimeoutTest {

    private BankAccount bankAccount;

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void test_assert_withdraw() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertDoesNotThrow(() -> bankAccount = new BankAccount(500.0, -1_000.0));
        assertDoesNotThrow(() -> bankAccount.withdraw(300.0));
        assertEquals(200.0, bankAccount.getBalance());
    }

    @Test
    public void test_assert_deposit(){
        assertDoesNotThrow(() -> bankAccount = new BankAccount(400.0, 0.0));
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(900.0, bankAccount.getBalance());
        assertTimeout(Duration.ofMillis(500), () -> Thread.sleep(400));
    }
}
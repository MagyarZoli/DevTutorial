package org.example.test.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AllAndEachTest {

    private static BankAccount bankAccount;
    private BankAccount bankAccount2;

//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("beforeAll");
//        bankAccount = new BankAccount(500.0, 0.0);
//    }

    @BeforeAll
    void beforeAll() {
        System.out.println("beforeAll");
        bankAccount = new BankAccount(500.0, 0.0);
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
        bankAccount2 = new BankAccount(500.0, 0.0);
    }

    @Test
    public void test_assert_deposit(){
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(1_000.0, bankAccount.getBalance());
    }

    @Test
    public void test_assert_deposit2(){
        assertDoesNotThrow(() -> bankAccount2.deposit(500.0));
        assertEquals(1_000.0, bankAccount2.getBalance());
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }
}
package org.example.test.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class OnTest {

    @Test
    @EnabledOnOs({OS.MAC})
    public void test1() {}

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void test2() {}

    @Test
    @EnabledOnJre({JRE.JAVA_19})
    public void test3() {}

    @Test
    @EnabledOnJre({JRE.JAVA_21})
    public void test4() {}

    @Test
    @DisabledOnJre({JRE.JAVA_19})
    public void test5() {}

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    public void test6() {}

    @Test
    @EnabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_19)
    public void shouldOnlyRunOnJava8UntilJava13() {
        // this test will only run on Java 8, 9, 10, 11, 12, and 13.
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_15)
    public void shouldNotBeRunOnJava14AndJava15() {
        // this won't run on Java 14 and 15.
    }

//    @Test
//    @EnabledIfSystemProperty()
//    public void test8() {}
//
//    @Test
//    @DisabledIfSystemProperty()
//    public void test9() {}
//
//    @Test
//    @EnabledIfEnvironmentVariable()
//    public void test10() {}
}
package org.example.lombok.auxiliary;

import org.example.auxiliary.Gender;
import org.example.lombok.pojo.Lombok;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LombokTest {

    private Long id;
    private String name;
    private byte age;
    private Lombok lombok;
    private Byte bAge;
    private Gender gender;

    @BeforeEach
    public void setUp() {
        id = 1L;
        name = "Lombok";
        age = (byte) 28;
        gender = Gender.MALE;
    }

    @Test
    public void test_NoArgsConstructor() {
        assertDoesNotThrow(() -> lombok = new Lombok());
        assertNotNull(lombok);
    }

//    @Disabled
//    @Test
//    public void test_RequiredArgsConstructor() {
//        assertDoesNotThrow(() -> lombok = new Lombok(name));
//        assertNotNull(lombok);
//    }

    @Test
    public void test_AllArgsConstructor() {
        assertDoesNotThrow(() -> lombok = new Lombok(id, name, age, gender));
        assertNotNull(lombok);
    }

    @Test
    public void test_Getter() {
        assertDoesNotThrow(() -> lombok = new Lombok(id, name, age, gender));
        invoke_Getter(lombok);
    }

    @Test
    public void test_Setter() {
        assertDoesNotThrow(() -> lombok = new Lombok());
        invoke_Null(lombok);
        lombok = invoke_Setter(id, name, age, gender);
        invoke_Getter(lombok);
    }

    @Test
    public void test_ToString() {
        assertDoesNotThrow(() -> lombok = new Lombok(id, name, age, gender));
        assertNotNull(lombok);
        System.out.println(lombok);
    }

    @Test
    public void test_HashCode() {
        assertDoesNotThrow(() -> lombok = new Lombok(id, name, age, gender));
        assertNotNull(lombok);
        System.out.println(lombok.hashCode());
    }

    @Test
    public void test_Builder() {
        assertDoesNotThrow(() -> lombok = Lombok.builder()
                .gender(Gender.FEMALE)
                .age((byte) 25)
                .id(2L)
                .name(name)
                .build());
        assertNotNull(lombok);
    }

    private void invoke_Null(Lombok lombok) {
        assertNotNull(lombok);
        assertNull(lombok.getId());
        assertNull(lombok.getName());
        bAge = lombok.getAge();
        assertEquals((byte) 0, bAge);
    }

    private void invoke_Getter(Lombok lombok) {
        assertNotNull(lombok);
        assertNotNull(lombok.getId());
        assertNotNull(lombok.getName());
        bAge = lombok.getAge();
        assertNotNull(bAge);
    }

    private Lombok invoke_Setter(Object... args) {
        lombok = new Lombok();
        lombok.setId((Long) args[0]);
        lombok.setName((String) args[1]);
        lombok.setAge((byte) args[2]);
        lombok.setGender((Gender) args[3]);
        return lombok;
    }
}
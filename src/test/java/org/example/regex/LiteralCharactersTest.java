package org.example.regex;

import java.util.regex.*;

import org.junit.jupiter.api.Test;

import static org.example.regex.RegexTest.regex;

public class LiteralCharactersTest {

    private String text;
    private Pattern regex;

    @Test
    public void case_sensitive_test() {
        text = "car";
        regex = Pattern.compile("car");
        regex(text, regex);
        text = "Car";
        regex = Pattern.compile("Car");
        regex(text, regex);
        text = "c a r";
        regex = Pattern.compile("c a r");
        regex(text, regex);
    }

    @Test
    public void case_insensitive_test() {
        text = "Car";
        regex = Pattern.compile("car", Pattern.CASE_INSENSITIVE);
        regex(text, regex);
    }
}
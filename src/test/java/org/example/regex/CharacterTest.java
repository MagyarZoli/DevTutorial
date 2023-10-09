package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.example.regex.RegexTest.regex;

public class CharacterTest {

    private String text;
    private Pattern regex;

    @Test
    public void single_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("[aeiou]");
        regex(text, regex);
    }

    @Test
    public void single_except_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("[^aeiou]");
        regex(text, regex);
    }

    @Test
    public void range_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("[e-l]");
        regex(text, regex);
    }

    @Test
    public void range_except_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("[^e-l]");
        regex(text, regex);
    }

    @Test
    public void range2_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("[e-lE-X]");
        regex(text, regex);
    }
}
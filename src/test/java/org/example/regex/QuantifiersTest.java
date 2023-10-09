package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.example.regex.RegexTest.regex;

public class QuantifiersTest {

    private String text;
    private Pattern regex;

    @Test
    public void zero_one_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\by?");
        regex(text, regex);
    }

    @Test
    public void zero_more_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\by*");
        regex(text, regex);
    }

    @Test
    public void one_more_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\by+");
        regex(text, regex);
    }

    @Test
    public void exactly_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\by{4}");
        regex(text, regex);
    }

    @Test
    public void greedy_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("a*");
        regex(text, regex);
    }

    @Test
    public void lazy_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("a*?");
        regex(text, regex);
    }

    @Test
    public void possessive_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("a+");
        regex(text, regex);
    }
}
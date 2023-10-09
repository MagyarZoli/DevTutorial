package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.example.regex.RegexTest.regex;

public class AnchorsTest {

    private String text;
    private Pattern regex;

    @Test
    public void start_string_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("^\\w+");
        regex(text, regex);
    }

    @Test
    public void end_string_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\w+$");
        regex(text, regex);
    }

    @Test
    public void start2_string_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\A\\w+");
        regex(text, regex);
    }

    @Test
    public void end2_string_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\w+\\Z");
        regex(text, regex);
    }

    @Test
    public void boundary_string_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\w+\\b");
        regex(text, regex);
    }

    @Test
    public void non_boundary_string_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("\\w+\\B");
        regex(text, regex);
    }
}
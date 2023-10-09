package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.example.regex.RegexTest.regex;

public class GroupConstructTest {

    private String text;
    private Pattern regex;

    @Test
    public void grouping_test() {
        text = """
               Insert your regular
               Expression here
               """;
        regex = Pattern.compile("(\\w+)");
        regex(text, regex);
    }
}
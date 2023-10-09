package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.example.regex.RegexTest.regex;

public class GeneralTokenTest {

    private String text;
    private Pattern regex;

    @Test
    public void newline_test() {
        text = """
               insert your regular
               expression here
               """;
        regex = Pattern.compile("\\w+\\n");
        regex(text, regex);
    }

    @Test
    public void tab_test() {
        text = """
               insert   your regular
               expression   here
               """;
        regex = Pattern.compile("\\w+\\t");
        regex(text, regex);
    }

}
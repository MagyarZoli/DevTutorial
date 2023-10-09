package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.example.regex.RegexTest.regex;

public class MetacharacterTest {

    private String text;
    private Pattern regex;

    @Test
    public void wildcard_test() {
        text = "hit hott h.t hat tah";
        regex = Pattern.compile("h.t");
        regex(text, regex);
    }

    @Test
    public void escaping_test() {
        text = "hit hott h.t hat tah";
        regex = Pattern.compile("h\\.t");
        regex(text, regex);
    }

    @Test
    public void whitespace_test() {
        text = "hit hott h.t hat tah";
        regex = Pattern.compile("h.t\\s");
        regex(text, regex);
        text = "hit hott h.t hat tah";
        regex = Pattern.compile("h.t\\S");
        regex(text, regex);
    }

    @Test
    public void digit_test() {
        text = "hit hit1 hott h.t hat tah";
        regex = Pattern.compile("h.t\\d");
        regex(text, regex);
        text = "hit hit1 hott h.t hat tah";
        regex = Pattern.compile("h.t\\D");
        regex(text, regex);
    }

    @Test
    public void word_test() {
        text = "hit hit1 hott h.t hat tah";
        regex = Pattern.compile("h.t\\w");
        regex(text, regex);
        text = "hit hit1 hott h.t hat tah";
        regex = Pattern.compile("h.t\\W");
        regex(text, regex);
    }
}
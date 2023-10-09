package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void regex(String text, Pattern pattern) {
        Matcher matcher = pattern.matcher(text);
        printMatcher(matcher);
    }

    public static void printMatcher(Matcher matcher) {
        if (matcher.matches()) {
            System.out.println(matcher.pattern());
            System.out.printf("Matches: %s%n", matcher.matches());
        }
        while (matcher.find()) {
            System.out.printf("%s [%d, %d]%n", matcher.group(), matcher.start(),  matcher.end());
        }
        System.out.println();
    }
}
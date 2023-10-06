package org.example.pattern.behavioral;

@FunctionalInterface
public interface Strategy {

    String strategy();

    Strategy SUBSTRATEGY = () -> "Applying sub strategy";
    Strategy SUB2STRATEGY = () -> "Applying sub2 strategy";
}
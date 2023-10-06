package org.example.pattern.auxiliary;

import lombok.AllArgsConstructor;
import org.example.pattern.behavioral.Strategy;

@AllArgsConstructor
public class Crypto {

    private String crypto;

    public void encrypt(Strategy strategy) {
        System.out.println(strategy.strategy() + " to " + crypto);
    }
}
package org.example.pattern.auxiliary;

import lombok.Data;

@Data
public class Buys {

    private String product;
    private float price;

    public void buys(int piece) {
        System.out.println(product + ": " + (piece * price));
    }
}
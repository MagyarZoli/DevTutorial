package org.example.pattern.auxiliary;

import org.example.pattern.structural.Composite;

public interface Payment
        extends Composite {

    @Override
    void getPayment(float pay);
}
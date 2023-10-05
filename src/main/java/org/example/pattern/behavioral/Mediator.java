package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.Buys;
import org.example.pattern.auxiliary.Document;
import org.example.pattern.auxiliary.Driver;

public class Mediator {

    private Document user;
    private Buys buys;
    private Driver driver;

    public Mediator(Document user) {
        this.user = user;
        buys = new Buys();
        driver = new Driver();
    }

    public void buy(String product, float price, int piece) {
        buys.setProduct(product);
        buys.setPrice(price);
        buys.buys(piece);
        driver.deliver(user);
    }
}
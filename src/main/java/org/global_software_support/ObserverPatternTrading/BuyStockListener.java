package org.global_software_support.ObserverPatternTrading;

public class BuyStockListener implements Observer {

    @Override
    public void update(float price) {
        if(price < 95)
            System.out.println("Buying stock because the S(t) price is low...");
    }
}

package org.global_software_support.ObserverPatternTrading;

public class SellStockListener implements Observer {

    @Override
    public void update(float price) {
        if(price > 105)
            System.out.println("Selling the stock because the S(t) price is too high...");
    }
}
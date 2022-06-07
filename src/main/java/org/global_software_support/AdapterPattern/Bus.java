package org.global_software_support.AdapterPattern;

public class Bus implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating...");
    }
}
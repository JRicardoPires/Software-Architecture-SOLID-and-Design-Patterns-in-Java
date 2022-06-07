package org.global_software_support.AdapterPattern;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

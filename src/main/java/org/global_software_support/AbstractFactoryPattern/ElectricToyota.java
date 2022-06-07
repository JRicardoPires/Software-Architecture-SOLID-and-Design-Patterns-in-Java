package org.global_software_support.AbstractFactoryPattern;

public class ElectricToyota implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a electric Toyota...");
    }
}

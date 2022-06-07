package org.global_software_support.AbstractFactoryPattern;

public class PetrolToyota implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling an petrol Toyota...");
    }
}

package org.global_software_support.AbstractFactoryPattern;

public class PetrolCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if(type.equals("FORD"))
            return new PetrolFord();
        else if(type.equals("TOYOTA"))
            return new PetrolToyota();

        return null;
    }
}
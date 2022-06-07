package org.global_software_support.AbstractFactoryPattern;

public class App {

    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");
        factory.getCar("TOYOTA").assemble();
    }
}
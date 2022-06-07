package org.global_software_support.DecoratorPattern;

public class App {

    public static void main(String[] args) {

        Beverage milkWith2Sugars = new Sugar(new Sugar(new Milk(new PlainBeverage())));

        System.out.println(milkWith2Sugars.getDescription());


    }
}
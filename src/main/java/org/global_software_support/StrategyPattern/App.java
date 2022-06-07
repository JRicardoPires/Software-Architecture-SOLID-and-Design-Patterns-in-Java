package org.global_software_support.StrategyPattern;

public class App {

    public static void main(String[] args) {

        OperationManagerBAD manager = new OperationManagerBAD();
        manager.execute(new Multiplication(), 10, 5);

    }
}

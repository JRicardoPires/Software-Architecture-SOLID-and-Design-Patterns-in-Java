package org.global_software_support.InterfaceSegregationPrincipleExample;

public class Employee implements IEmployee {

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }
}


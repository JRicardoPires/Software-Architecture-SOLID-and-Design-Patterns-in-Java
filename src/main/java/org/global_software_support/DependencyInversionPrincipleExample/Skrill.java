package org.global_software_support.DependencyInversionPrincipleExample;

public class Skrill implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with Skrill...");
    }
}

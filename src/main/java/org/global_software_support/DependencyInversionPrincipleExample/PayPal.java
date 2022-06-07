package org.global_software_support.DependencyInversionPrincipleExample;

public class PayPal implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with PayPal...");
    }
}

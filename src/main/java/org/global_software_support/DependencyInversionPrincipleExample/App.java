package org.global_software_support.DependencyInversionPrincipleExample;

public class App {

    public static void main(String[] args) {

        WebStore store = new WebStore();
        store.purchaseItem();

    }
}

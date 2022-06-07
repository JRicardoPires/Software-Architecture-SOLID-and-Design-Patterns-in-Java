package org.global_software_support.DependencyInversionPrincipleExample;

public class WebStore {

    private PaymentController controller;

    public WebStore() {
        controller = new PaymentController();
        controller.setPaymentMethod(new Payoneer());
    }

    public void purchaseItem() {
        this.controller.pay();
    }
}

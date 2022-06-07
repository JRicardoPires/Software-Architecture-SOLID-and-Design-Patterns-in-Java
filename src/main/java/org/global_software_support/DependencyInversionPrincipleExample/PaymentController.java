package org.global_software_support.DependencyInversionPrincipleExample;

public class PaymentController {

    private PaymentMethod paymentMethod;

    public PaymentController() {

    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        this.paymentMethod.pay();
    }
}

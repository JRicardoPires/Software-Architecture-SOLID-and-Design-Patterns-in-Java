package org.global_software_support.DependencyInversionPrinciple;

public class App {

    public static void main(String[] args) {

        DatabaseController controller = new DatabaseController(new OracleDatabase());
        controller.connect();
        controller.disconnect();

    }
}

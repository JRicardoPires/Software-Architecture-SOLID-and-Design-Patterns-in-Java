package org.global_software_support.DependencyInversionPrinciple;

public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to an Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting the Oracle database...");
    }
}

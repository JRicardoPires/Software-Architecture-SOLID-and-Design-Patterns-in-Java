package org.global_software_support.DependencyInversionPrinciple;

public class DatabaseController {

    private Database database;

    public DatabaseController(Database database) {
        this.database = database;
    }

    public void connect() {
        this.database.connect();
    }

    public void disconnect() {
        this.database.disconnect();
    }
}
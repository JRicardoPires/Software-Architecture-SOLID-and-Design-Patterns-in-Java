package org.global_software_support.JavaSolidMVC.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Person> peopleDatabase;

    public Database(){
        this.peopleDatabase = new ArrayList<>();
    }

    public void addPerson(Person person){
        this.peopleDatabase.add(person);
    }

    public void removePerson(Person person){
        this.peopleDatabase.remove(person);
    }

    public List<Person> getPeopleDatabase(){
        return this.peopleDatabase;
    }
}
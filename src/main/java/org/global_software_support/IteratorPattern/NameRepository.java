package org.global_software_support.IteratorPattern;

public class NameRepository {

    private String[] names = { "Adam","Joe","John","Sarah" };

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}

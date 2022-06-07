package org.global_software_support.ObserverPattern;

public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers();
}
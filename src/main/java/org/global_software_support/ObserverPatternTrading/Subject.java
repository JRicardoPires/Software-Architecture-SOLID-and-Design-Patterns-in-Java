package org.global_software_support.ObserverPatternTrading;

public interface Subject {
    public void addObserver(Observer o);
    public void notifyAllObserver();
}

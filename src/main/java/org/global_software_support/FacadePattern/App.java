package org.global_software_support.FacadePattern;

public class App {

    public static void main(String[] args) {

        SortingManager manager = new SortingManager();

        manager.bubbleSort();
        manager.mergeSort();
        manager.heapSort();

    }
}
package org.global_software_support.CommandPatternII;

public class App {

    public static void main(String[] args) {

        final Algorithm algorithm = new Algorithm();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                algorithm.produce();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                algorithm.consume();
            }
        });

        t1.start();
        t2.start();

    }
}

package org.global_software_support.InterfaceSegregationPrinciple;

public class App {

    public static void main(String[] args) {

        RotationTree tree = new BalancedTree();

        tree.insert();
        tree.delete();
        tree.traverse();
        tree.leftRotation();
        tree.rightRotation();

    }
}
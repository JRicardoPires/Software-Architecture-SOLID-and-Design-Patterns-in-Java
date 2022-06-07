package org.global_software_support.StrategyPattern;

public class OperationManagerBAD {

    public void execute(Object o, int num1, int num2) {

        if( o instanceof Addition)
            ((Addition) o).execute(num1, num2);
        else if(o instanceof Multiplication)
            ((Multiplication) o).execute(num1, num2);
    }
}

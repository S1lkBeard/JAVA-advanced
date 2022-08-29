package CalcOOP;

import CalcOOP.operation.Operation;

public class Calculator {

    private Calculation calculation;

    public Calculator(Calculation calculation){
        this.calculation = calculation;
    }

    public void calculation(String msv0, String msv1, String msv2) {
        final Operation operation = calculation.calc(msv0, msv1, msv2);
        System.out.println("Результат вычисления = " + operation.operate());
    }
}

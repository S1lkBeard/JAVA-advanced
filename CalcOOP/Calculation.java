package CalcOOP;

import CalcOOP.operation.*;

public class Calculation {

    public Operation calc(String msv0, String msv1, String msv2) {
        float firstValue = Float.valueOf(msv0);
        float secondValue = Float.valueOf(msv2);
        Operation newOp = null;
        switch (msv1) {
            case "+":
                newOp = new SumOperation(firstValue, secondValue);
                break;
            case "-":
                newOp = new RazOperation(firstValue, secondValue);
                break;
            case "*":
                newOp = new UmnOperation(firstValue, secondValue);
                break;
            case "/":
                newOp = new DelOperation(firstValue, secondValue);
                break;
            default:
                System.out.println("Введён некорректный математический оператор. Повторите попытку");
                break;
        }
        return newOp;
    }
}

package CalcOPP_v2;

public class Calculator {

    private double fNumber;
    private double sNumber;
    private String operation;


    public Calculator(double fNumber, double sNumber, String operation) {
        this.fNumber = fNumber;
        this.sNumber = sNumber;
        this.operation = operation;
    }


    public double getFNumber() {
        return fNumber;
    }


    public void setFNumber(double fNumber) {
        this.fNumber = fNumber;
    }


    public double getSNumber() {
        return sNumber;
    }


    public void setSNumber(double sNumber) {
        this.sNumber = sNumber;
    }


    public String getOperation() {
        return operation;
    }


    public void setOperation(String operation) {
        this.operation = operation;
    }


    public double calculation() {
        double res = 0;
        switch (operation) {
            case "+":
                return fNumber + sNumber;
            case "-":
                return fNumber - sNumber;
            case "*":
                return fNumber * sNumber;
            case "/":
                //добавил try-catch для деления на 0, но опытным путём установил, что при
                //использовании переменных, отличных от byte и int, при делении на 0
                //ошибка ArithmeticException не отлавливается
                //при использовании переменных других типов (float, double, long)
                //результатом деления на 0 является "Infinity"
                //эту странную конструкцию с преобразованием из double в int добавил
                //для отлавливания ArithmeticException
                if (sNumber == 0) {
                    int fNumberInt = (int) fNumber;
                    int sNumberInt = (int) sNumber;
                    try {
                        res = fNumberInt / sNumberInt;
                    } catch (ArithmeticException e3) {
                        System.out.println("Делить на ноль можно, но не нужно");
                        System.out.println("Ошибка: " + e3);
                    }
                } else {
                    res = fNumber / sNumber;
                }
                return res;
            default:
                throw new UnsupportedOperationException("Некорректная операция, Введите +,-,/,*");
        }
    }
}

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
        switch (operation) {
            case "+":
                return fNumber + sNumber;
            case "-":
                return fNumber - sNumber;
            case "*":
                return fNumber * sNumber;
            case "/":
                if (sNumber == 0) {
                    throw new ArithmeticException("Делить на ноль можно, но не нужно");
                }
                return fNumber / sNumber;
            default:
                throw new UnsupportedOperationException("Введён некорректный математический оператор. Повторите попытку");
        }
    }
}

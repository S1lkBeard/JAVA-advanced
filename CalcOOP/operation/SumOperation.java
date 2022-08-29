package CalcOOP.operation;

public class SumOperation implements Operation {

    private final float num1;
    private final float num2;

    public SumOperation(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public float operate() {
        return addNumbers(num1, num2);
    }

    private float addNumbers(float a, float b) {
        return a + b;
    }
}

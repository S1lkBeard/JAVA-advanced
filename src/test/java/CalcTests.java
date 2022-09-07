import CalcOPP_v2.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalcTests {

    @Test
    public void testCalculatorCalculationSum() {
        Calculator calc = new Calculator(8, 4, "+");
        Assert.assertEquals(12, calc.calculation(), 0);
    }

    @Test
    public void testCalculatorCalculationRaz() {
        Calculator calc = new Calculator(8, 4, "-");
        Assert.assertEquals(4, calc.calculation(), 0);
    }

    @Test
    public void testCalculatorCalculationUmn() {
        Calculator calc = new Calculator(8, 4, "*");
        Assert.assertEquals(32, calc.calculation(), 0);
    }

    @Test
    public void testCalculatorCalculationDel() {
        Calculator calc = new Calculator(8, 4, "/");
        Assert.assertEquals(2, calc.calculation(), 0);
    }

    @Test
    public void testSetFirstNumber() {
        Calculator calc = new Calculator(8, 4, "+");
        calc.setFNumber(5);
        Assert.assertEquals(9, calc.calculation(), 0);
    }

    @Test
    public void testSetSecondNumber() {
        Calculator calc = new Calculator(8, 4, "+");
        calc.setSNumber(5);
        Assert.assertEquals(13, calc.calculation(), 0);
    }

    @Test
    public void testSetOperation() {
        Calculator calc = new Calculator(8, 4, "+");
        calc.setOperation("-");
        Assert.assertEquals(4, calc.calculation(), 0);
    }

}

package CalcOPP_v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double msv0 = in.nextDouble();
        System.out.println("Введите математический оператор - '+', '-', '*' или '/'");
        String msv1 = in.next();
        System.out.println("Введите число");
        double msv2 = in.nextDouble();
        //double res = 0;
        Calculator calc = new Calculator(msv0, msv2, msv1);
        //res = calc.calculation();
        System.out.println("Результат вычисления = " + calc.calculation());
    }
}

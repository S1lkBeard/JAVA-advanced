package CalcOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String msv0 = in.next();
        System.out.println("Введите математический оператор - '+', '-', '*' или '/'");
        String msv1 = in.next();
        System.out.println("Введите число");
        String msv2 = in.next();
        String msv[] = new String[3];
        msv[0] = msv0;
        msv[1] = msv1;
        msv[2] = msv2;
        Calculation calculation = new Calculation();
        Calculator calculator = new Calculator(calculation);
        calculator.calculation(msv[0], msv[1], msv[2]);
    }
}

package CalcOPP_v2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число");
            double msv0 = in.nextDouble();
            System.out.println("Введите математический оператор - '+', '-', '*' или '/'");
            String msv1 = in.next();
            System.out.println("Введите число");
            double msv2 = in.nextDouble();
            Calculator calc = new Calculator(msv0, msv2, msv1);
            System.out.println("Результат вычисления = " + calc.calculation());
        } catch (InputMismatchException e) {
            System.out.println("Введён некорректный символ. Повторите попытку");
            System.out.println("Ошибка: " + e);
        }
    }
}

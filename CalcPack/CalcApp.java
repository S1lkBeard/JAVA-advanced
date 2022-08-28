package CalcPack;

import java.util.Scanner;
import CalcPack.Actions.*;

public class CalcApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        float pr1 = in.nextFloat();
        System.out.println("Введите математический оператор - '+', '-', '*' или '/'");
        String simvol = in.next();
        System.out.println("Введите число");
        float pr2 = in.nextFloat();
        float calc = 0;
        Action newOp;
        switch (simvol) {
            case "+":
                newOp = new Sum();
                calc = newOp.action(pr1, pr2);
                System.out.printf("Сумма двух введенных чисел = " + "%.4f", calc);
                break;
            case "-":
                newOp = new Razn();
                calc = newOp.action(pr1, pr2);
                System.out.printf("Разница двух введенных чисел = " + "%.4f", calc);
                break;
            case "*":
                newOp = new Umn();
                calc = newOp.action(pr1, pr2);
                System.out.printf("Произведение двух введенных чисел = " + "%.4f", calc);
                break;
            case "/":
                newOp = new Del();
                calc = newOp.action(pr1, pr2);
                System.out.printf("Частное двух введенных чисел = " + "%.4f", calc);
                break;
            default:
                System.out.println("Введён некорректный математический оператор. Повторите попытку");
                break;
        }
        in.close();
    }
}

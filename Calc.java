package JAVA_adv_gr;

import java.util.Scanner;

/**
 * Created on 05.08.2022
 *
 * @author s1lkbeard
 */

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число");
        float pr1 = in.nextFloat();
        System.out.println("Введите дробное число");
        float pr2 = in.nextFloat();
        System.out.printf("%.4f", pr1 + pr2);
    }
}
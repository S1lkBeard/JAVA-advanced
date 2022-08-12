package JAVA_adv_gr;

import java.util.Scanner;

/**
 * Created on 12.08.2022
 *
 * @author s1lkbeard
 * @see #summa(float, float)
 * @see #raznica(float, float)
 * @see #umnojenie(float, float)
 * @see #delenie(float, float)
 */

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите 1 или 2");
        byte vibor = in.nextByte();
        switch (vibor) {
            case 1:
                System.out.println("Введите число");
                float pr1 = in.nextFloat();
                System.out.println("Введите математический оператор - '+', '-', '*' или '/'");
                String simvol = in.next();
                System.out.println("Введите число");
                float pr2 = in.nextFloat();
                switch (simvol) {
                    case "+":
                        float sum = summa(pr1, pr2);
                        System.out.printf("%.4f", sum);
                        break;
                    case "-":
                        float raz = raznica(pr1, pr2);
                        System.out.printf("%.4f", raz);
                        break;
                    case "*":
                        float umn = umnojenie(pr1, pr2);
                        System.out.printf("%.4f", umn);
                        break;
                    case "/":
                        float del = delenie(pr1, pr2);
                        System.out.printf("%.4f", del);
                        break;
                    default:
                        System.out.println("Введён некорректный математический оператор. Повторите попытку");
                        break;
                }
                break;
            case 2:
                System.out.println("Введите размер массива");
                int razmerMassiva = in.nextInt();
                String[] massiv = new String[razmerMassiva];
                System.out.println("Введите " + razmerMassiva + " слов/слова. После каждого слова необходимо нажать ENTER");
                for (int i = 0; i < razmerMassiva; i++) {
                    massiv[i] = in.next();
                }
                int max = massiv[0].length();
                String slovo = massiv[0];
                for (int i = 0; i < razmerMassiva; i++) {
                    if (massiv[i].length() > max) {
                        max = massiv[i].length();
                        slovo = massiv[i];
                    }
                }
                System.out.println("Самое длинное слово в массиве - " + slovo);
                break;
            default:
                System.out.println("Выбран несуществующий режим. Повторите попытку");
                break;
        }
        in.close();
    }

    /**
     *
     * @param x - параметры вводятся в самом начале исполнения кода в случае, если был выбран режим калькулятора
     * @param y
     * @return - возвращается сумма/разница/умножение/деление в зависимости от введенного математического оператора
     */
    //В методах не было необходимости, но я хотел попробовать реализовать код в таком виде
    public static float summa(float x, float y) {
        return (x + y);
    }

    public static float raznica(float x, float y) {
        return (x - y);
    }

    public static float umnojenie(float x, float y) {
        return (x * y);
    }

    public static float delenie(float x, float y) {
        return (x / y);
    }
}

package JAVA_adv_gr;

import java.util.Random;

public class Task03_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] msv = new int[20];
        int minPlus = 10;
        int maxMinus = -10;
        int minPlusI = 0;
        int maxMinusI = 0;
        int buffer;
        for (int i = 0; i < msv.length; i++) {
            msv[i] = rnd.nextInt(-10, 10);
            System.out.print(msv[i] + " ");
            if (msv[i] < minPlus & msv[i] > 0) {
                minPlus = msv[i];
                minPlusI = i;
            }
            if (msv[i] > maxMinus & msv[i] < 0) {
                maxMinus = msv[i];
                maxMinusI = i;
            }
        }
        System.out.println();
        System.out.println("Минимальный положительный элемент массива = " + minPlus);
        System.out.println("Максимальный отрицательный элемент массива = " + maxMinus);
        buffer = msv[minPlusI];
        msv[minPlusI] = msv[maxMinusI];
        msv[maxMinusI] = buffer;
        for (int i = 0; i < msv.length; i++) {
            System.out.print(msv[i] + " ");
        }
    }
}

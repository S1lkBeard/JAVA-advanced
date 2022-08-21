package JAVA_adv_gr;

import JAVA_adv_gr.SweetGift.Candy;
import JAVA_adv_gr.SweetGift.Gift;
import JAVA_adv_gr.SweetGift.Jellybean;

public class Base {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Конфета1", 20.0, 10.0, "S");
        Jellybean jellybean1 = new Jellybean("Карамель1", 10.0, 10.0, "карамель");
        Gift[] box = {candy1, jellybean1};
        double sumWeight = 0;
        double sumPrice = 0;
        for (Gift someGift : box) {
            System.out.println(someGift.toString());
        }
        for (int i = 0; i < box.length; i++) {
            sumWeight = sumWeight + box[i].getWeight();
            sumPrice = sumPrice + box[i].getPrice();
        }
        System.out.println("Суммарный вес подарка = " + sumWeight + "г");
        System.out.println("Цена подарка = " + sumPrice + "р");
    }
}
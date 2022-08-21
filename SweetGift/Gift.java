package JAVA_adv_gr.SweetGift;

public class Gift {
    private String Name;
    private double Weight;
    private double Price;
    private String Size;

    public Gift(String name, double weight, double price, String size) {
        Name = name;
        Weight = weight;
        Price = price;
        Size = size;
    }

    public String getName() {
        return Name;
    }

    public double getWeight() {
        return Weight;
    }

    public double getPrice() {
        return Price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Наименование = " + Name + ", вес = " + Weight + ", цена = " + Price;
    }
}

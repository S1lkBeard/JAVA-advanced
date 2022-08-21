package JAVA_adv_gr.SweetGift;

public class Candy extends Gift {
    private String size;

    public Candy(String name, double weight, double price, String size) {
        super(name, weight, price, size);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Конфета [" + super.toString() + ", размер = " + size + "]";
    }
}

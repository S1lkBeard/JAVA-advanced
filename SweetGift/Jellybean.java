package JAVA_adv_gr.SweetGift;

public class Jellybean extends Gift {
    private String type;

    public Jellybean(String name, double weight, double price, String type) {
        super(name, weight, price, type);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Карамель [" + super.toString() + ", тип = " + type + "]";
    }
}

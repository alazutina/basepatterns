package creational.Builder;

public class Sweets {
    private  String name;
    private Kind kind;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", kind=" + kind +
                ", price=" + price +
                '}';
    }
}

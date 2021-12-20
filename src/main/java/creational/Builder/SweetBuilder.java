package creational.Builder;

public abstract class SweetBuilder {
    Sweets sweet;

    void createSweet(){
        sweet = new Sweets();
    }

    abstract void buildName();
    abstract void buildKind();
    abstract void buildPrice();

    Sweets getSweet(){
        return sweet;
    }
}

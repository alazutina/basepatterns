package creational.Builder;

public class SweetManager {
    SweetBuilder sb ;

    public void setSweet(SweetBuilder sb) {
        this.sb = sb;
    }

    Sweets buildSweet(){
        sb.createSweet();
        sb.buildName();
        sb.buildKind();
        sb.buildPrice();

        Sweets sweet = sb.getSweet();
        return sweet;

    }
}

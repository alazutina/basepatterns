package creational.Builder;

public class IceCreamBuilder extends SweetBuilder{
    @Override
    void buildName() {
        sweet.setName("Ice cream");

    }

    @Override
    void buildKind() {
        sweet.setKind(Kind.ICE_CREAM);

    }

    @Override
    void buildPrice() {
sweet.setPrice(150);
    }
}

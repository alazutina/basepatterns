package creational.Builder;

public class CakeBuilder extends SweetBuilder{


    @Override
    void buildName() {
        sweet.setName("Cake");

    }

    @Override
    void buildKind() {
        sweet.setKind(Kind.CAKE);

    }

    @Override
    void buildPrice() {
        sweet.setPrice(1000);


    }


}

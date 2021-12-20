package creational.Builder;

public class MiniCakeBuilder extends SweetBuilder{
    @Override
    void buildName() {
        sweet.setName("Mini-cake");
   }

    @Override
    void buildKind() {
        sweet.setKind(Kind.MINI_CAKE);
    }

    @Override
    void buildPrice() {
        sweet.setPrice(200);
    }
}

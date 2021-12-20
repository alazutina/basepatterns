package creational.AbstractFactory;

public interface ShopTeamFactory {
    Director getDirector();
    Seller getSeller();
    Manager getManager();
}

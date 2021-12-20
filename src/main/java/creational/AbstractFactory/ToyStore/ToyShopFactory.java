package creational.AbstractFactory.ToyStore;

import creational.AbstractFactory.Director;
import creational.AbstractFactory.Manager;
import creational.AbstractFactory.Seller;
import creational.AbstractFactory.ShopTeamFactory;

public class ToyShopFactory implements ShopTeamFactory {

    @Override
    public Seller getSeller(){
        return new ToySeller();
    }
    @Override
    public Director getDirector(){
        return new ToyDirector();
    }
    @Override
    public Manager getManager(){
        return new ToyManager();
    }
}

package creational.AbstractFactory;

import creational.AbstractFactory.CandyStore.CandyShopFactory;
import creational.AbstractFactory.ToyStore.ToyShopFactory;

public class LegoToyShop {
    public static void main(String[] args){
        ShopTeamFactory legoToyShop = new ToyShopFactory();
        Director director = legoToyShop.getDirector();
        Seller seller = legoToyShop.getSeller();
        Manager manager = legoToyShop.getManager();

        System.out.println("Lego shop");
        director.direct();
        manager.manage();
        seller.sell();

    }
}

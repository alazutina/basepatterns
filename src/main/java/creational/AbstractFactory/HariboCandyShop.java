package creational.AbstractFactory;

import creational.AbstractFactory.CandyStore.CandyShopFactory;

public class HariboCandyShop {
    public static void main(String[] args){
        ShopTeamFactory hariboCandyShop = new CandyShopFactory();
        Director director = hariboCandyShop.getDirector();
        Seller seller = hariboCandyShop.getSeller();
        Manager manager = hariboCandyShop.getManager();

        System.out.println("Haribo candy shop");
        director.direct();
        manager.manage();
        seller.sell();

    }
}

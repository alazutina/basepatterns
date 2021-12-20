package creational.AbstractFactory.CandyStore;

import creational.AbstractFactory.Director;
import creational.AbstractFactory.Manager;
import creational.AbstractFactory.Seller;
import creational.AbstractFactory.ShopTeamFactory;


public class CandyShopFactory  implements ShopTeamFactory {

        @Override
        public Seller getSeller(){
            return new CandySeller();
        }
        @Override
        public Director getDirector(){
            return new CandyDirector();
        }
        @Override
        public Manager getManager(){
            return new CandyManager();
        }
    }


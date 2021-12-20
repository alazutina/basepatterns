package creational.AbstractFactory.CandyStore;

import creational.AbstractFactory.Seller;

public class CandySeller implements Seller{
        @Override
        public void sell(){
            System.out.println("A candy seller sells sweets");
        }
}

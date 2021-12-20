package creational.AbstractFactory.CandyStore;

import creational.AbstractFactory.Manager;

public class CandyManager implements Manager {
    @Override
    public void manage(){
        System.out.println("A candy shop manager manages");
    }
}


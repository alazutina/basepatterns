package creational.AbstractFactory.ToyStore;

import creational.AbstractFactory.Manager;

public class ToyManager implements Manager {
    @Override
    public void manage(){
        System.out.println("A toy shop manager manages");
    }
}

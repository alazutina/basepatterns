package creational.AbstractFactory.ToyStore;


import creational.AbstractFactory.Director;

public class ToyDirector implements Director {
    @Override
    public void direct(){
        System.out.println("A toy shop director directs");
    }
}

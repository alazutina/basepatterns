package creational.AbstractFactory.CandyStore;

import creational.AbstractFactory.Director;

public class CandyDirector  implements Director{

    @Override
        public void direct(){
            System.out.println("A candy shop director directs");
        }
}

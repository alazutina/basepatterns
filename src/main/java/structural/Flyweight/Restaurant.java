package structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static void main(String [] args){

        ChefFactory chefFactory = new ChefFactory();
        List <Chef> chefs = new ArrayList<>();

        chefs.add(chefFactory.getChef("dinner"));
        chefs.add(chefFactory.getChef("dinner"));
        chefs.add(chefFactory.getChef("dinner"));
        chefs.add(chefFactory.getChef("dinner"));
        chefs.add(chefFactory.getChef("dinner"));
        chefs.add(chefFactory.getChef("dinner"));
        chefs.add(chefFactory.getChef("dinner"));
        chefs.add(chefFactory.getChef("lunch"));
        chefs.add(chefFactory.getChef("lunch"));
        chefs.add(chefFactory.getChef("lunch"));
        chefs.add(chefFactory.getChef("lunch"));
        chefs.add(chefFactory.getChef("lunch"));

for (Chef chef: chefs){
    chef.cook();
}
    }
}

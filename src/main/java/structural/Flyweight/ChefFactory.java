package structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChefFactory {
    private static  final  Map<String, Chef> chefs =
            new HashMap<>();

    public Chef getChef(String specialty){
        Chef chef = chefs.get(specialty);

        if(chef == null){
            switch (specialty){
                case "dinner":
                    System.out.println("DinnerChef");
                    chef = new DinnerChef();
                    break;
                case "lunch":
                    System.out.println("LunchChef");
                    chef = new LunchChef();
                    break;
            }
            chefs.put(specialty,chef);
        }
        return chef;
    }
}

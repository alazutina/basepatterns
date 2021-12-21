package behavioral.command;



public class CommandRunner {
    public static void main(String [] args){

        Dish dish = new Dish();

        Chef chef = new Chef(new CookCommand(dish), new CutCommand(dish));

chef.cookDish();
chef.cutDish();


    }
}


package structural.Facade;

public class Facade {

    Chef chef = new Chef();
    Dinner dinner = new Dinner();
    Cooking cooking = new Cooking();

    public void work(){
        cooking.cook();
        dinner.start();
        chef.cook(dinner);
        dinner.finish();
        chef.cook(dinner);

    }

}

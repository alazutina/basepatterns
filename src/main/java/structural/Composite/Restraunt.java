package structural.Composite;

import structural.Composite.BrekfastChef;
import structural.Composite.Chef;
import structural.Composite.LunchChef;

public class Restraunt {
    public static void main(String [] args){

        Staff staff = new Staff();

        Chef Masha = new BrekfastChef();
        Chef Vasya = new LunchChef();
        Chef Petya = new BrekfastChef();
        Chef Vanya = new LunchChef();

        staff.addStaff(Masha);
        staff.addStaff(Petya);
        staff.addStaff(Vasya);
        staff.addStaff(Vanya);

        staff.cookAllDishes();




    }
}

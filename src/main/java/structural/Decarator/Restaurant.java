package structural.Decarator;

public class Restaurant {
    public static void main(String[] args){
        Chef chef = new BreakfastChef( new HeadChef(new LunchChef()));
        chef.cook();
    }
}

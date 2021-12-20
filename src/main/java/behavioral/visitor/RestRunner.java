package behavioral.visitor;

public class RestRunner {
    public static void main(String[ ]args){

        Restaurant restaurant = new Restaurant();

        Chef firstChef = new FirstChef();
        Chef secondChef = new SecondChef();

        System.out.println("first chef");

restaurant.beCooked(firstChef);
        System.out.println("-------------");
        System.out.println("second chef");
restaurant.beCooked(secondChef);


    }
}

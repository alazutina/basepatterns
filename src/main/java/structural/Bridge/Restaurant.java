package structural.Bridge;

public class Restaurant {
    public static void main(String[] args){

        Dishes [] dishes = {
                new Lunch(new LunchChef()),
                new Brekfast(new BrekfastChef())
        };

      for(Dishes dish: dishes){
          dish.cook();
      }

    }
}

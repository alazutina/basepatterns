package behavioral.visitor;

public class Restaurant implements Dishes{
    Dishes [] dishes;

    public Restaurant() {
        this.dishes = new Dishes[]{
                new Brekfast(),
                new Lunch()
        };
    }

    @Override
    public void beCooked(Chef chef) {
        for(Dishes dish: dishes){
            dish.beCooked(chef);

        }

    }
}

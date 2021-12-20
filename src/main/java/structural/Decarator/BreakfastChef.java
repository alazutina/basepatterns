package structural.Decarator;

public class BreakfastChef extends ChefDecarator{
    public BreakfastChef(Chef chef) {
        super(chef);
    }

    public void breakfastChefCook(){
        System.out.println("breakfastChefCook");

    }

    @Override
    public void cook() {
        super.cook();
        breakfastChefCook();
    }
}

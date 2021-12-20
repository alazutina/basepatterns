package structural.Decarator;

public class HeadChef extends ChefDecarator{

    public HeadChef(Chef chef) {
        super(chef);
    }

    public void headChefCook(){
System.out.println("headChefCook");
    }

    @Override
    public void cook() {
        super.cook();
        headChefCook();
    }
}

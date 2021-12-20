package structural.Bridge;

public class Lunch extends Dishes{
    public Lunch(Chef chef) {
        super(chef);
    }

    @Override
    public void cook() {
        System.out.println("Lunch is being prepared");
chef.cook();
    }
}

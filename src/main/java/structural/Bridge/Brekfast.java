package structural.Bridge;

public class Brekfast extends Dishes {
    public Brekfast(Chef chef) {
        super(chef);
    }

    @Override
    public void cook() {
System.out.println("Breakfast is being prepared");
chef.cook();
    }
}

package structural.Decarator;

public class ChefDecarator implements Chef{
Chef chef;

    public ChefDecarator(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void cook() {
        chef.cook();

    }
}

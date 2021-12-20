package behavioral.visitor;

public class Lunch implements Dishes{
    @Override
    public void beCooked(Chef chef) {
        chef.cook(this);

    }
}

package behavioral.visitor;

public class Brekfast implements Dishes {
    @Override
    public void beCooked(Chef chef) {
        chef.cook(this);

    }
}

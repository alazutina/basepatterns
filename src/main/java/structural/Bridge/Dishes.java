package structural.Bridge;

public abstract class Dishes {

    protected  Chef chef;

   protected Dishes(Chef chef) {
        this.chef = chef;
    }

    public abstract void cook();
}

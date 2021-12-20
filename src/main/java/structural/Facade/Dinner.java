package structural.Facade;

public class Dinner {
    private boolean active;

    public boolean isDinnerActive(){
        return active;
    }

    public void start(){
        System.out.println("Dinner is being prepared");
        active = true;
    }
    public void finish(){
        System.out.println("Dinner is ready");
        active = false;
    }
}

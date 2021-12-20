package behavioral.strategy;

public class Winter implements Season{
    @Override
    public void newSeason() {
        System.out.println("Winter");
    }
}

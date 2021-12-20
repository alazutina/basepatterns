package behavioral.strategy;

public class Fall implements Season{
    @Override
    public void newSeason() {
        System.out.println("Fall");
    }
}
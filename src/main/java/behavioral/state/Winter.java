package behavioral.state;

public class Winter implements Season{
    @Override
    public void newSeason() {
        System.out.println("Winter");
    }
}

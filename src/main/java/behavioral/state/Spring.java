package behavioral.state;

public class Spring implements Season{
    @Override
    public void newSeason() {
        System.out.println("Spring");
    }
}
package behavioral.state;

public class Fall implements Season{
    @Override
    public void newSeason() {
        System.out.println("Fall");
    }
}
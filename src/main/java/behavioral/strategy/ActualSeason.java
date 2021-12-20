package behavioral.strategy;

public class ActualSeason {

    Season season;

    public void setSeason(Season season) {
        this.season = season;
    }

    public void executeSeason(){
        season.newSeason();
    }
}

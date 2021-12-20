package behavioral.state;

public class SeasonRunner {
    public static void main(String [] args){
        Season season = new Summer();
        ActualSeason actualSeason = new ActualSeason();

        actualSeason.setSeason(season);

        for(int i = 0;i<10;i++){

            actualSeason.change();
            actualSeason.changeSeason();

        }

    }
}

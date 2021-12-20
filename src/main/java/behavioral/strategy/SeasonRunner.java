package behavioral.strategy;

public class SeasonRunner {
    public static void main(String [] args){

       ActualSeason actualSeason = new ActualSeason();

       actualSeason.setSeason(new Summer());
       actualSeason.executeSeason();

        actualSeason.setSeason(new Fall());
        actualSeason.executeSeason();

        actualSeason.setSeason(new Winter());
        actualSeason.executeSeason();

        actualSeason.setSeason(new Spring());
        actualSeason.executeSeason();

        actualSeason.setSeason(new Summer());
        actualSeason.executeSeason();






    }
}

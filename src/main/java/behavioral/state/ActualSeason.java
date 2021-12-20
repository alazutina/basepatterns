package behavioral.state;

public class ActualSeason {
    Season season;

    public void setSeason(Season season){
        this.season = season;
    }

    public void change(){
        if(season instanceof  Spring){
            setSeason(new Summer());
        } else if (season instanceof Summer) {
            setSeason(new Fall());
        } else if(season instanceof Fall){
            setSeason(new Winter());
                    }
        else if(season instanceof Winter){
            setSeason(new Spring());
        }
        }

        public void changeSeason(){
        season.newSeason();
        }
    }


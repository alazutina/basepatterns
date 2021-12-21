package behavioral.Command;

public class Chef {

    Command cook;
    Command cut;

    public Chef(Command cook, Command cut) {
        this.cook = cook;
        this.cut = cut;
    }

        public void cookDish(){
            cook.execute();
        }
        public void cutDish(){
           cut.execute();
        }
    }

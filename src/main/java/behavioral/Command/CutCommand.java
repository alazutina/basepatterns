package behavioral.Command;



public class CutCommand  implements Command {

        Dish dish;

        public CutCommand(Dish dish) {
            this.dish = dish;
        }
        @Override
        public void execute() {
            dish.cut();
        }
    }



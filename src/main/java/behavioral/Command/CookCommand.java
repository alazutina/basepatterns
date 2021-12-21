package behavioral.Command;




public class CookCommand implements Command {

    Dish dish;

    public CookCommand(Dish dish) {
        this.dish = dish;
    }
        @Override
        public void execute() {
            dish.cook();
        }
    }

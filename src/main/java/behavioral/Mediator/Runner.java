package behavioral.Mediator;

public class Runner {
        public static void main(String[] args) {
            User Masha = new User("Masha");
            User Vasya = new User("Vasya");
            Masha.sendMessage("Hello");
            Vasya.sendMessage("Hello");
            Masha.sendMessage("Goodbye");
            Vasya.sendMessage("Goodbye");
        }
    }

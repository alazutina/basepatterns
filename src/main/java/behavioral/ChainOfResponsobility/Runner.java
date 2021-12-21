package behavioral.ChainOfResponsobility;

public class Runner {
    public static void main(String [] arga){


GradesNotifier firstNotifier = new FirstNotifier(Priority.FIVE);
GradesNotifier secondNotifier  = new SecondNotifier(Priority.FOUR);
GradesNotifier thirdNotifier    = new ThirdNotifier(Priority.THREE);

firstNotifier.setNextNotifier(secondNotifier);
secondNotifier.setNextNotifier(thirdNotifier);

firstNotifier.notifyManager("very good ", Priority.FIVE);
System.out.println("===========================================");
firstNotifier.notifyManager("good", Priority.FOUR);
        System.out.println("===========================================");
firstNotifier.notifyManager("not good", Priority.THREE);


    }
}

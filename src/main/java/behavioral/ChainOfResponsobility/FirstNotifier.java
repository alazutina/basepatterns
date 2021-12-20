package behavioral.ChainOfResponsobility;

public class FirstNotifier extends GradesNotifier{
    public FirstNotifier(int priority){
        super(priority);
    }

    @Override
    public void write(String message) {
System.out.println("Запись в дневнике "+message);
    }
}


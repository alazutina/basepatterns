package behavioral.ChainOfResponsobility;

public class ThirdNotifier extends  GradesNotifier{
    public ThirdNotifier(int priorety) {
        super(priorety);
    }

    @Override
    public void write(String message) {
System.out.println("Сообщение маме "+message);
    }
}

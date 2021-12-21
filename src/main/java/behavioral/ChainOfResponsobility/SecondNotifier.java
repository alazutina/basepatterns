package behavioral.ChainOfResponsobility;

public class SecondNotifier extends  GradesNotifier {

    public SecondNotifier(int priority){
        super(priority);
    }
    @Override
    public void write(String message) {
System.out.println("Сообщение классному руководителю  "+message);
    }
}

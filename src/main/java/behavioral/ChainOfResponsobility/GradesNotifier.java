package behavioral.ChainOfResponsobility;

public abstract class GradesNotifier {
    private int priorety;
    private  GradesNotifier nextNotifier;

    public GradesNotifier(int priorety) {
        this.priorety = priorety;
    }

    public void setNextNotifier(GradesNotifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level){
        if (level >= priorety) {
        write(message);
        }
        if(nextNotifier!=null){
            nextNotifier.notifyManager(message, level);
        }
        }


    public abstract void write(String message);
}

package behavioral.visitor;

public class SecondChef implements Chef{
    @Override
    public void cook(Brekfast brekfast) {
        System.out.println("Finishing cooking breakfast.....");
    }

    @Override
    public void cook(Lunch lunch) {
        System.out.println("Finishig cooking lunch.....");
    }
}

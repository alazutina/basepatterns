package behavioral.visitor;

public class FirstChef implements Chef{
    @Override
    public void cook(Brekfast brekfast) {
System.out.println("Begining cooking breakfast.....");
    }

    @Override
    public void cook(Lunch lunch) {
        System.out.println("Begining cooking lunch.....");
    }
}

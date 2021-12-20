package creational.Builder;

public class BuildRunner
{
    public static void main(String [] args){
        SweetManager manager = new SweetManager();
        manager.setSweet(new IceCreamBuilder());
        Sweets sweet = manager.buildSweet();

        System.out.println(sweet);
    }
}

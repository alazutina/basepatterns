package structural.Facade;

public class Chef {
    public void  cook(Dinner dinner){
        if(dinner.isDinnerActive()){
            System.out.println("Chef cooks dinner");
        }
        else{
            System.out.println("Chef rests");
        }
    }
}

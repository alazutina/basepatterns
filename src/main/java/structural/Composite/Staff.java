package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Chef> staff = new ArrayList<Chef>();

    public void addStaff(Chef chef){
        staff.add(chef);
    }

    public void removeStaff(Chef chef){
        staff.remove(chef);
    }

    public void cookAllDishes(){
        System.out.println("Staff starts to work");
        for (Chef chef: staff){
            chef.cook();
        }
    }
}

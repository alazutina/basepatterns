package behavioral.observer;

import java.util.List;

public class Student implements Observer{

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void newInLessons(List<String> lessons1) {
    //    System.out.println("d");
        System.out.println("Dear "+name+ " new in lessons "+lessons1+"\n==========================================");

    }
}

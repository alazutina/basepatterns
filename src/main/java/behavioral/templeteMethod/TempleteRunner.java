package behavioral.templeteMethod;

public class TempleteRunner {
    public static void main(String [] args){
        Student Masha = new Student("Masha");

        Teacher Vasya = new Teacher("Vasya");

        Masha.showPage();

        System.out.println("==================");


        Vasya.showPage();
    }
}

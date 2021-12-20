package behavioral.observer;

public class Runner {
    public static void main(String args[]){

        Lessons lessons = new Lessons();

        lessons.addLesson("Math");
        lessons.addLesson("IT");



        Observer Masha = new Student("Masha");
        Observer Vanya = new Student("Vanya");

        lessons.addObserver(Masha);
        lessons.addObserver(Vanya);

        lessons.addLesson("PE");
        lessons.removeLesson("IT");


    }
}

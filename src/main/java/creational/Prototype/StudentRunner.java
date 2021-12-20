package creational.Prototype;

public class StudentRunner {
    public static void main(String [] args){
        Student masha = new Student(1,"Masha","IT");
        System.out.println(masha);

        StudentFactory sf = new StudentFactory(masha);
        Student clone = sf.cloneStudent();

        System.out.println(clone);
    }
}

package behavioral.templeteMethod;

public class Student extends Template
{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
System.out.print("Dear student, "+name);
    }
}

package behavioral.templeteMethod;

public class Teacher extends Template
{
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.print("Dear teacher, "+name);
    }
}

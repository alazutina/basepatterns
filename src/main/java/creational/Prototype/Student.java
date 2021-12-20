package creational.Prototype;

public class Student implements Copyable{
    private  int id;
    private  String name;
    private  String faculty;

    public Student(int id, String name, String faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Student copyOfStudent = new Student(id, name,faculty);
        return copyOfStudent;
    }
}

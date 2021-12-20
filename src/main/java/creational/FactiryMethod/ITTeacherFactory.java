package creational.FactiryMethod;

public class ITTeacherFactory implements TeacherFactory{
    @Override
    public Teacher createTeacher(){
        return new ITTeacher();
    }
}

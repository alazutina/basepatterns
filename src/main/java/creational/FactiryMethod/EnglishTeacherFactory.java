package creational.FactiryMethod;

public class EnglishTeacherFactory implements TeacherFactory{
    @Override
    public Teacher createTeacher(){
        return new EnglishTeacher();
    }

}

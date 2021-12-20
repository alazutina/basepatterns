package creational.FactiryMethod;

public class School {
    public static void main(String [] args){
        TeacherFactory tf  = createTeacher("it");
        Teacher t  = tf.createTeacher();

        t.teach();
    }
    static  TeacherFactory createTeacher(String subject){
        if(subject.equalsIgnoreCase("math")) {
            return new MathTeacherFactory();
        }
        else if(subject.equalsIgnoreCase("english")){
            return new EnglishTeacherFactory();
        }
        else if(subject.equalsIgnoreCase("it")){
            return new ITTeacherFactory();
        }
        else {
            throw  new RuntimeException(subject+" is unknown subject");
        }
    }
}

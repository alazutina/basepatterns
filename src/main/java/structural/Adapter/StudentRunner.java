package structural.Adapter;

public class StudentRunner {
    public static void main(String[] args){
        Student masha = new AdapterToStudent();

        masha.put();
        masha.get();
        masha.search();
        masha.delete();
    }
}

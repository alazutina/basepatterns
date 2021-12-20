package structural.Adapter;

public class AdapterToStudent extends JavaApplication implements Student {
    @Override
    public void put() {
        putStudent();

    }

    @Override
    public void get() {
        getStudent();

    }

    @Override
    public void delete() {
        deleteStudent();

    }

    @Override
    public void search() {
        searchStudent();

    }
}

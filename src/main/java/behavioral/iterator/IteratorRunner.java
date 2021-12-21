package behavioral.iterator;

public class IteratorRunner {//тест
    public static void main(String[] args) {
        int i [] =  {3, 2, 3};

        Numbers numbers = new Numbers(i);

        Iterator iterator = numbers.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

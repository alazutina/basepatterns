package behavioral.iterator;

interface Iterator {
    boolean hasNext();
    Object next();
}


class Numbers {

    public int num[];

    public Numbers(int[] num) {
        this.num = num;
    }



    public Iterator getIterator() {
        return new NumbersIterator();
    }


    private class NumbersIterator implements Iterator {
        int ind = 0;
        public boolean hasNext() {
            if(ind < num.length) return true;
            return false;
        }
        public Object next() {
            if(this.hasNext()) return num[ind++];
            return null;
        }
    }
}

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

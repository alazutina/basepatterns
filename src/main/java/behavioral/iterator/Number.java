package behavioral.iterator;


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

interface MinMax<T extends Comparable<T>> {
    T max();
}

class GenericInterface<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    
    GenericInterface(T[] o) {
        vals = o;
    }

    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

package org.example.tuple_class;


import java.util.Comparator;


public class Tuple<V> implements Comparator<V> {

    private V left;
    private V right;

    public Tuple(V left, V right) {
        this.left = left;
        this.right = right;
    }

    public V getLeft() {
        return left;
    }

    public V getRight() {
        return right;
    }


    @Override
    public int compare(V o1, V o2) {
        return Integer.compare((Integer) o1, (Integer) o2);

    }

    public V getMax(V o1, V o2) {
        int result = compare(o1, o2);
        if (result >= 0) {
            return o1;
        } else {
            return o2;
        }
    }


    public V getMin(V o1, V o2) {
        int result = compare(o1, o2);
        if (result <= 0) {
            return o1;
        } else {
            return o2;
        }
    }


}

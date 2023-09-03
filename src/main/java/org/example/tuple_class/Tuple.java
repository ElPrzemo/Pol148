package org.example.tuple_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tuple<V extends Comparable<V>> {

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




    public V getMax(){
        List<V> list = new ArrayList();
        list.add(getLeft());
        list.add(getRight());
        V max =  (Collections.max(list));
        return max;
    }

    public V getMin(){
        List<V> list = new ArrayList();
        list.add(getLeft());
        list.add(getRight());
        V min =  (Collections.min(list));
        return min;
    }
}

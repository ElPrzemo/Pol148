package org.example.tuple_class;

public class Tuple<V, S> {

    private V left;
    private S right;

    public Tuple(V left, S right) {
        this.left = left;
        this.right = right;
    }

    public V getLeft() {
        return left;
    }

    public S getRight() {
        return right;
    }
}

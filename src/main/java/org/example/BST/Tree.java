package org.example.BST;

public interface Tree <T extends Comparable<T>>{
    Tree<T> insert(T data)throws Exception;
    void delete(T data);
    void traverse();
    T getMax(Node<T> node);
    T getMin();
    boolean isEmpty();
}

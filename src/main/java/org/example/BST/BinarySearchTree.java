package org.example.BST;

public class BinarySearchTree <T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;

    @Override
    public Tree<T> insert(T data) {
       root=insert(data,root);
        return this;
    }

    private Node<T> insert(T data, Node<T> node) {
        if(node==null){
            return new Node<>(data);
        }
        if( node.getData().compareTo(data)<0) {
           node.setRighChild( insert(data,node.getRighChild()));
        }
        else{
            node.setLeftChild( insert(data,node.getLeftChild()));
        }
        return node;
    }

    @Override
    public void delete(T data) {
        delete(data,root);

    }

    private Node<T> delete(T data, Node<T> node) {
        if(node==null){
            System.out.println("Tree data null");
        }
        else {
            if(data.compareTo(node.getData())<0){
               node.setLeftChild(delete(data,node.getLeftChild()));
            }
            else if (data.compareTo(node.getData())>0){
               node.setRighChild( delete(data, node.getRighChild()));
            }
            else {
                if(node.getLeftChild()==null){
                    return node.getRighChild();
                }
                else if(node.getRighChild()==null){
                    return node.getLeftChild();
                }
                node.setData(getMax(node.getLeftChild()));
               // delete(node.getData(),node.getLeftChild());
                node.setLeftChild(delete(node.getData(),node.getLeftChild()));
            }
            }
         return node;
        }



    @Override
    public void traverse() {
           inorderTraverse(root);

    }
    public void inorderTraverse(Node<T> node){
        if(node!=null){
            inorderTraverse(node.getLeftChild());
            System.out.println(node.getData());
           inorderTraverse(node.getRighChild());
        }
    }

    @Override
    public T getMax(Node<T> node) {
        if(isEmpty())
            return null;

        while (node.getRighChild()!=null)
            node=node.getRighChild();
        return node.getData();
    }

    @Override
    public T getMin() {
        if(isEmpty())
        return null;
        Node<T> node=root;
        while (node.getLeftChild()!=null)
            node=node.getLeftChild();
        return node.getData();

    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }



}

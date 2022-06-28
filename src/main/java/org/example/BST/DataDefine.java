package org.example.BST;

public class DataDefine {
    public DataDefine(){
        BinarySearchTree<Integer> objectBinarySearchTree=new BinarySearchTree<>();
        Node<Integer> node=new Node<>(10);
        //node.setData(10);
        objectBinarySearchTree.insert(10);
        objectBinarySearchTree.insert(5);
        objectBinarySearchTree.insert(15);
        objectBinarySearchTree.insert(20);
        objectBinarySearchTree.delete(5);

        //objectBinarySearchTree.insert(4);
        System.out.println(objectBinarySearchTree.getMin()+"<-min node in tree");
        // System.out.println(objectBinarySearchTree.getMax()+"<-max node in tree");
        objectBinarySearchTree.traverse();

        System.out.println(objectBinarySearchTree.isEmpty());
    }
}

package org.example.BST;

public class DataDefine {
    public DataDefine(){
        BinarySearchTree<Integer> objectBinarySearchTree=new BinarySearchTree<>();
      //  Node<Integer> node=new Node<>(10);
        //node.setData(10);
        objectBinarySearchTree.insert(25);
        objectBinarySearchTree.insert(20);
        objectBinarySearchTree.insert(30);
        objectBinarySearchTree.insert(35);
        objectBinarySearchTree.insert(40);

      /*  objectBinarySearchTree.insert(40);
        objectBinarySearchTree.insert(35);
        objectBinarySearchTree.insert(36);*/

   /*     objectBinarySearchTree.insert(35);
        objectBinarySearchTree.insert(36);
        objectBinarySearchTree.insert(40);*/

      /*  objectBinarySearchTree.insert(30);
        objectBinarySearchTree.insert(35);
        objectBinarySearchTree.insert(40);*/


        // objectBinarySearchTree.delete(5);

        //objectBinarySearchTree.insert(4);
        System.out.println(objectBinarySearchTree.getMin()+"<-min node in tree");
        // System.out.println(objectBinarySearchTree.getMax()+"<-max node in tree");
        objectBinarySearchTree.traverse();
        objectBinarySearchTree.delete(25);
        System.out.println("After deletion of the node");
        objectBinarySearchTree.traverse();

        System.out.println(objectBinarySearchTree.isEmpty());
    }
}

package org.example.BST;

public class BinarySearchTree <T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;

    @Override
    public Tree<T> insert(T data) {
       root=insert(data,root);
        return this;
    }

    private Node<T> insert(T data, Node<T> node) {
        System.out.println("Inserting data :"+data+", root : "+node);
        if(node==null){

            return new Node<>(data);
        }
        if( node.getData().compareTo(data)<0) {
           node.setRighChild( insert(data,node.getRighChild()));
        }
        else if(node.getData().compareTo(data)>0){
            node.setLeftChild( insert(data,node.getLeftChild()));
        }
       /* else {
            return node;
        }*/
       // node.setHeight(heightOfTheNode(node));
        updateHeight(node);
        node=rotaionForBalancing(node);
        System.out.println(node+" root node return after performing balance");
        
        return node;
    }

    private Node<T> rotaionForBalancing(Node<T> node) {
        System.out.println("rotaionForBalancing()"+ node);
        int balance=balance(node);
        System.out.println("Balance:"+balance);
        if(balance>1){
            System.out.println("Balance is more than 1"+balance+" -> "+node);
            if(balance(node.getLeftChild())<0){
                System.out.println("Balance is less than 0"+balance+" -> "+node.getLeftChild() );
                node.setLeftChild(rotateLeft(node.getLeftChild()));
            }
            System.out.println("rotateRight"+ node);
            return rotateRight(node);
        }
        if (balance<-1){
            System.out.println("Balance is less than -1:"+balance+" -> "+node);

            if(balance(node.getRighChild())>0){
                System.out.println("Balance is more than 0"+balance+" -> "+node.getRighChild() );

                node.setRighChild(rotateRight(node.getRighChild()));
            }
            System.out.println("rotateLeft"+ node);

            return rotateLeft(node);
        }
        return node;
    }

    private Node<T> rotateLeft(Node<T> node) {
        Node<T> rightNode=node.getRighChild();
        Node<T> centerNode=rightNode.getLeftChild();
        rightNode.setLeftChild(node);
        node.setRighChild(centerNode);


        updateHeight(node);
        System.out.println("update hieght in rotate left method"+ node);
        updateHeight(rightNode);
        return rightNode;
    }

    private Node<T> rotateRight(Node<T> node) {
        Node<T> leftNode=node.getLeftChild();
        Node<T> centerNode=leftNode.getRighChild();
        leftNode.setRighChild(node);
        node.setLeftChild(centerNode);
        //node.setHeight(heightOfTheNode(node));
        updateHeight(node);
        updateHeight(leftNode);
       // leftNode.setHeight(heightOfTheNode(leftNode));
        return leftNode;

    }

    private void updateHeight(Node<T> node) {
        int maxHeight=Math.max(height(node.getLeftChild()),
                height(node.getRighChild()
                ));
        node.setHeight(maxHeight+1);
    }
    private int height(Node<T> node){
        return node!=null?node.getHeight():-1;
    }

    private int balance(Node<T> node) {
       /* int left=-1,right=-1;
       if(node.getLeftChild()!=null){
          left= height(node.getLeftChild());
       }

       if(node.getRighChild()!=null){
          right= height(node.getRighChild());
       }
        System.out.println("Balance() leftchild :"+left+", right child:"+right);
        return left-right;*/

        return node!=null?height(node.getLeftChild()) - height(node.getRighChild()):0;
    }

    /*private int heightOfTheNode(Node<T> node) {
        return node!=null ? Math.max(node.getLeftChild()!=null?node.getLeftChild().getHeight():0,
                node.getRighChild()!=null?node.getLeftChild().getHeight():0)+1:0;

    }*/

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
        System.out.println("Inorder Travers");
        inorderTraverse(root);
        System.out.println("Preorder Travers");
        preorderTraverse(root);
        System.out.println("Postorder Travers");
        postorderTraverse(root);

    }

    private void postorderTraverse(Node<T> node) {
        if(node!=null){
            postorderTraverse(node.getLeftChild());
            postorderTraverse(node.getRighChild());
            System.out.println(node.getData());

        }
    }

    private void preorderTraverse(Node<T> node) {
        if(node!=null){
            System.out.println(node.getData());
            preorderTraverse(node.getLeftChild());
            preorderTraverse(node.getRighChild());
        }
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

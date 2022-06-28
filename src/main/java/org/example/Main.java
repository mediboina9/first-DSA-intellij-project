package org.example;


import org.apache.maven.artifact.versioning.ComparableVersion;
import org.example.BST.BinarySearchTree;
import org.example.BST.DataDefine;
import org.example.BST.Node;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //DataDefine dataDefine=new DataDefine();
       // IcimsPrepairation obj=new IcimsPrepairation();
    //    ExceptionQuestionFromIcims ob=new ExceptionQuestionFromIcims();
     //   System.out.println(ob.ExceptionQuestionFromIcims());

        DataDefine o=new DataDefine();



                String v1="1.0.10";
                String v2="1.0.27";

                String  arr1[]=v1.split(".");
                 String  arr2[]=v2.split(".");

        ComparableVersion obj=new ComparableVersion(v1);
        ComparableVersion obj1=new ComparableVersion(v2);
        if(obj.compareTo(obj1)<0){
            System.out.println(v2);
            //System.out.println(obj1.compareTo(obj));
        }
        else {
            System.out.println(v1);
        }




    }
}
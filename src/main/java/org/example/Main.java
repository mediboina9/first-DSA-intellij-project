package org.example;


import org.apache.maven.artifact.versioning.ComparableVersion;
import org.example.BST.BinarySearchTree;
import org.example.BST.DataDefine;
import org.example.BST.Node;
import org.example.interfac.IAdd;

import java.util.Arrays;
import java.util.logging.Logger;


public class Main {
    public static int fib(int n){
        //System.out.println(n+ "n value");
        if(n==1) return 0;
        if(n==2) return 1;
        int val = 0;
        if(n>=3)
        {
            int val1=fib(n-1);
           // System.out.println("n-1: "+val1);
            int val2=fib(n-2);
            //System.out.println("n-2: "+val2);
            val= val1+val2;
        }
        return val;

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //DataDefine dataDefine=new DataDefine();
       // IcimsPrepairation obj=new IcimsPrepairation();
    //    ExceptionQuestionFromIcims ob=new ExceptionQuestionFromIcims();
     //   System.out.println(ob.ExceptionQuestionFromIcims());

       // DataDefine o=new DataDefine();

     /*   IAdd obj=x -> {return x+x;};
        System.out.println(obj.sum(10));

        String str1=new String("abc");
        String str2=new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));*/

      // System.out.println(fib(60));
       int n=1;
       long fib1=0;
       long fib2=1;
       long fib;
       if(n>=1) System.out.println(fib1);
       if(n>=2) System.out.println(fib2);
       for(int i=3;i<n;i++){
           fib=fib1+fib2;
           System.out.println(fib);
           fib1=fib2;
           fib2=fib;
       }
       System.out.println("Array size of elements:354,224,848,179,261,915,075");
        int n1=1000;
        int[] fib_1=new int[30];
        int[] fib_2=new int[30];
        fib_1[29]=0;
        fib_2[29]=1;
        if(n1>=0) System.out.println(" fib1 : "+fib_1[19]);
        if(n1>=1) System.out.println(" fib2 : "+fib_2[19]);
        int j=29;
        for(int i=2;i<n1;i++){
            j=29;
            System.out.println("for loop value of i:"+i);
          //  sum[j]=fib_1[j]+fib_2[j]%2147483647;
           // carry[j-1]=(fib_1[j]+fib_2[j])/2147483647;
            int[] carry=new int [30];
            int[] sum=new int[30];
            System.out.println("sum[16]"+sum[16]);
            System.out.println("carry[19]"+sum[19]);


            while (carry[j]!=0||j==29||fib_1[j]!=0||fib_2[j]!=0)
            {


                //System.out.println("while loop value of j:"+j);
               // sum[j]=carry[j]+fib_1[j]%100000000+fib_2[j]%100000000;

               // System.out.println(check+" : check : "+sub+" :sub");
                //carry[j-1]=(carry1+carry2+carry[j])/10000000;
                int carryPlusSum=(carry[j]+fib_1[j]+fib_2[j]);
                carry[j-1]=carryPlusSum/100000000;
                sum[j]=carryPlusSum%100000000;
                System.out.println("sum : "+sum[j]+" fib1 and fib2 : "+fib_1[j]+fib_2[j]+" carry : "+carry[j-1]);
                fib_1[j]=fib_2[j];
                fib_2[j]=sum[j];

                j--;
            }
            fib_1[j]=0;
            fib_2[j]=0;
           /* System.out.println("start: "+fib_1[j+1]);
            System.out.println("start: "+fib_2[j+1]);*/
         /*   fib_1=fib_2;
            fib_2=sum;
            sum=fib_1;*/
           // System.out.println(fib_1[j+1]);
            //System.out.println(fib_2[j+1]);

        }
    }

}
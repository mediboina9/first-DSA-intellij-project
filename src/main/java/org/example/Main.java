package org.example;


import org.example.amirGLInterview.FibonaaciSeries;

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
    //  ExceptionQuestionFromIcims ob=new ExceptionQuestionFromIcims();
     //   System.out.println(ob.ExceptionQuestionFromIcims());
        //BST Tree Data
       // DataDefine o=new DataDefine();

     /*   IAdd obj=x -> {return x+x;};
        System.out.println(obj.sum(10));

        String str1=new String("abc");
        String str2=new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));*/

      // System.out.println(fib(60));
        FibonaaciSeries fibonaaciSeries=new FibonaaciSeries();
        fibonaaciSeries.Fibancci1000SeriesUsingArray(1001);

    }

}
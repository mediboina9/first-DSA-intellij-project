package org.example.amirGLInterview;

public class LambadExpressonAndStrings {
    public static void main(String[] args) {
            IAdd obj=x -> {return x+x;};
        System.out.println(obj.sum(10));

        String str1=new String("abc");
        String str2=new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

         FibonaaciSeries fibonaaciSeries=new FibonaaciSeries();
         fibonaaciSeries.Fibancci1000SeriesUsingArray(1000);
    }
}

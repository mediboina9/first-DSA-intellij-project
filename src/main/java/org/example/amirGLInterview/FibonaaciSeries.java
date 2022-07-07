package org.example.amirGLInterview;

public class FibonaaciSeries {
    public void FibacciIntegerRange(int n) {

        long fib1 = 0;
        long fib2 = 1;
        long fib;
        if (n >= 1) System.out.println(fib1);
        if (n >= 2) System.out.println(fib2);
        for (int i = 3; i < n; i++) {
            fib = fib1 + fib2;
            System.out.println(fib);
            fib1 = fib2;
            fib2 = fib;
        }
    }

    public void Fibancci1000SeriesUsingArray(int n1) {

        System.out.println("Fibnacci " + n1 + "series of elements!");
        int[] fib_1 = new int[30];
        int[] fib_2 = new int[30];
        fib_1[29] = 0;
        fib_2[29] = 1;
        if (n1 >= 0) System.out.println(" fib1 : " + fib_1[19]);
        if (n1 >= 1) System.out.println(" fib2 : " + fib_2[19]);
        int j = 29;
        for (int i = 2; i < n1; i++) {
            j = 29;
            System.out.println("for loop value of i:" + i);
            int[] carry = new int[30];
            int[] sum = new int[30];
            while (carry[j] != 0 || j == 29 || fib_1[j] != 0 || fib_2[j] != 0) {
                int carryPlusSum = (carry[j] + fib_1[j] + fib_2[j]);
                carry[j - 1] = carryPlusSum / 100000000;
                sum[j] = carryPlusSum % 100000000;
              //  System.out.println("sum : " + sum[j] + " fib1 and fib2 : " + fib_1[j] + fib_2[j] + " carry : " + carry[j - 1]);
                fib_1[j] = fib_2[j];
                fib_2[j] = sum[j];
                j--;
                // System.out.println(sum1(carry[j],sum[j],fib_1[j],fib_2[j]));
            }
           // System.out.println("while end and for loop start"+sum[j+1]);
            fib_1[j] = 0;
            fib_2[j] = 0;
            for(int k = j+1; k <30; k++){
                System.out.print(sum[k]+",");
            }

            System.out.println();
        }
    }
}

  /*  private int[] sum1(int carry, int sum, int fib_1, int fib_2) {
        int j=29;

        if(carry[j]!=0||j==29||fib_1[j]!=0||fib_2[j]!=0){
            int carryPlusSum=(carry[j]+fib_1[j]+fib_2[j]);
            carry[j-1]=carryPlusSum/100000000;
            sum[j]=carryPlusSum%100000000;
            //System.out.println("sum : "+sum[j]+" fib1 and fib2 : "+fib_1[j]+fib_2[j]+" carry : "+carry[j-1]);
            fib_1=fib_2;
            fib_2=sum;
            j--;
            System.out.println(sum1(carry[j-1],sum[j-1],fib_1[j-1],fib_2[j-1]));
    }


}*/

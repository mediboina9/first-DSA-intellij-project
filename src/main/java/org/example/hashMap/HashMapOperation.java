package org.example.hashMap;

import java.util.Arrays;
import java.util.*;

public class HashMapOperation {
   public int getHigestCountIndex(){

       Map<Integer, Integer> hashMap=new HashMap<>();
       int arr[] ={10,20,30,20,10,40,50,20};
       for(int i=0;i< arr.length;i++){
           Integer a= hashMap.get(arr[i]);
           if(a!=null){
               hashMap.put(arr[i],a+1);
           }
           else {
               hashMap.put(arr[i],1);
           }
       }
       Integer higestCountNumber=hashMap.entrySet().stream().max((o1, o2) -> {
           if(o1.getValue()>o2.getValue()) return 1;
           else return -1;
       }).get().getKey();

       Iterator it=hashMap.keySet().iterator();
       while (it.hasNext()){
           System.out.println(it.next()+" iterator keySet");
       }

       Iterator it1=hashMap.entrySet().iterator();
       while (it1.hasNext()){
           System.out.println(it1.next()+" iterator entrySet");
       }

       for (Integer i:hashMap.values()
            ) {
           System.out.println(i+" values");

       }

       for (Integer i:hashMap.keySet()){
           System.out.println(i+" KeyValue");

       }
       String A="A";
       System.out.println(A.hashCode()+": hashcode of A");
       String B="B";
       System.out.println(B.hashCode()+": hashcode of B");
       String a="a";
       System.out.println(a.hashCode()+": hashcode of a");
       String z="z";
       System.out.println(z.hashCode()+": hashcode of z");

       String s1="siva";
       System.out.println(s1+" -> "+s1.hashCode()+" :s1=siva");
       s1=s1+"satya";
       System.out.println(s1+" -> "+s1.hashCode()+" :s1+satya");
       String s2="siva";
       System.out.println(s2+" -> "+s2.hashCode()+" :s2=siva");

       String s3="sivasatya";
       System.out.println(s3+" -> "+s3.hashCode()+" :s3=sivasatya");

       String s4=s1;
       System.out.println(s4+" -> "+s4.hashCode()+" :s4=s1");


       return higestCountNumber;
   }




}

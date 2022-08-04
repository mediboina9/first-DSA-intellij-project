package org.example.shubhashYogowaka;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsAndTraditionalCoding {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,5,8,3,8,2);

        Set<Integer> hs=new HashSet<>();
        list.stream().filter(n -> !hs.add(n)).forEach(System.out::println);

         list.stream().filter(i->i%2==0).forEach(System.out::println);


        System.out.println(10 + 20 + "Javatpoint"+10+20);
        //30 Javatpoint
        System.out.println("Javatpoint" + 10 + 20);
        //JavatPoint1020

        List<String> stirngList = Arrays.asList("Test", "Java", "Programming", "Ability");
        List<String> sorted_list = new ArrayList<>(new TreeSet<>(stirngList));
        System.out.println(sorted_list);

        /*List<String> sorted_list1 = Ordering.natural().sortedCopy(list);
        System.out.println(sorted_list1);*/
    }

}




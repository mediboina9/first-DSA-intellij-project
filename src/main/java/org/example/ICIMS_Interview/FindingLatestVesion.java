package org.example.ICIMS_Interview;

import org.apache.maven.artifact.versioning.ComparableVersion;

import java.util.Arrays;

public class FindingLatestVesion {

    String v1 = "1.0.10";
    String v2 = "1.0.27";


    ComparableVersion obj = new ComparableVersion(v1);
    ComparableVersion obj1 = new ComparableVersion(v2);
    /*
        if(obj.compareTo(obj1) < 0)

    {
        System.out.println(v2);
        //System.out.println(obj1.compareTo(obj));
    }
        else

    {
        System.out.println(v1);
    }

    String arr1[] = v1.split(".");
    String arr2[] = v2.split(".");
    //Arrays.streams(arr1).forEach(System.out::println);
    //System.out.println(Arrays.compare(arr2,arr1));
    int a[] = new int[arr1.length];
    int b[] = new int[arr2.length];
        if(arr1.length>arr2.length)
        {
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i].compareTo(arr2[i]) == 0) {
                // System.out.println(arr1[i].compareTo(arr2[i])+" i:"+i);
            }
            System.out.println(arr1[i].compareTo(arr2[i]) + " i:" + i);

        }
    }*/
}

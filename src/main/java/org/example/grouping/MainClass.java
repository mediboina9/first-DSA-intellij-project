package org.example.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>(){
            {
                add(new Student(1,"siva",6,"zpph", "kakinada"));
                add(new Student(2,"krisha",8,"zpph", "kakinada"));
                add(new Student(3,"Devi",8,"zpph", "kakinada"));
                add(new Student(4,"shankar",1,"basham", "kakinada"));
                add(new Student(5,"sandeep",6,"basham", "thanuku"));
            }
        };

        Map<String, List<Student>> groupBySchoolName=list.stream().collect(Collectors.groupingBy(Student::getSchoolName));
        groupBySchoolName.entrySet().stream().forEach(System.out::println);
    }
}

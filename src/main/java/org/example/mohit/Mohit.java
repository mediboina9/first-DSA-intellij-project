package org.example.mohit;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Mohit {
    public static void main(String[] args) throws IOException {
        HashMap<Student,Subject> hashMap=new HashMap<>();
       Student student=new Student(1,"siva");
       Student student1=new Student(2,"Narayana");
       Student student2=new Student(3, "Krishna");

       Subject subject=new Subject(1,"Mathematics");
       Subject subject1=new Subject(2,"Physics");
       Subject subject2=new Subject(3, "Chemistry");

       hashMap.put(student,subject);
       hashMap.put(student1,subject1);
       hashMap.put(student2,subject);
       System.out.println("hashMap index: "+hashMap.get(student));
       ArrayList<Student> al=new ArrayList<>();
       LinkedHashMap<Student,Subject> linkedHashMap=new LinkedHashMap<>();
        for(Student i:hashMap.keySet()){
            System.out.println(i);
            al.add(i);
        }
        Collections.sort(al);
       // al.stream().sorted(Comparator.comparing(Student::getStudentName)).map(i->linkedHashMap.put(hashMap.get(i)));
        for (Student i:al){
            linkedHashMap.put(i,hashMap.get(i));
        }
        linkedHashMap.entrySet().stream().forEach(System.out::println);
    }

}

class Student implements Comparable<Student> {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(studentName.compareTo(o.studentName)==0) {
            return 0;
        }

            else if (studentName.compareTo(o.studentName)==1){
                return 1;
            }
            else return -1;

    }
}
class Subject{
    int id;
    String subName;

    public Subject(int id, String subName) {
        this.id = id;
        this.subName = subName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subName='" + subName + '\'' +
                '}';
    }
}

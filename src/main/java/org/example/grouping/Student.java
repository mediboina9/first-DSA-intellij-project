package org.example.grouping;

public class Student {
    private int id;
    private String name;
    private int classNumber;
    private String schoolName;
    private String studentCity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public Student(int id, String name, int classNumber, String schoolName, String studentCity) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
        this.schoolName = schoolName;
        this.studentCity = studentCity;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber=" + classNumber +
                ", schoolName='" + schoolName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}

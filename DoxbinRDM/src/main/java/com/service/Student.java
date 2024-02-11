package com.service;

public class Student extends Peoples {
    private float gpa;
    private String University;

    public Student(int id, String name, String surname, boolean gender, float gpa, String University, int phone,String Address) {
        super(id, name, surname, gender, phone,Address);
        this.gpa = gpa;
        this.University = University;
    }

    public String getUniversity() {
        return University;
    }

    public float getGpa() {
        return gpa;
    }
    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "GPA: " + getGpa() + "\n" +
                "University:" + getUniversity();
    }
}
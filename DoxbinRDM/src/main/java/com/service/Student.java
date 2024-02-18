package com.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Peoples {
    private float gpa;
    private String University;
    public Student(int id, String name, String surname, boolean gender, float gpa, String University, long phone, String Address) {
        super(id, name, surname, gender, phone,Address);
        this.gpa = gpa;
        this.University = University;
    }
    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "GPA: " + getGpa() + "\n" +
                "University: " + getUniversity();
    }
}

package com.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker extends Peoples {
    private String Occupation;
    private int Salary;
    private String Education;
    private boolean Married;

    public Worker(int id, String name, String surname, boolean gender, long phone, int Salary, String Occupation, String Education, boolean Married, String Address) {
        super(id, name, surname, gender,phone,Address);
        this.Salary = Salary;
        this.Occupation = Occupation;
        this.Education = Education;
        this.Married = Married;
    }

    @Override
    public String getPosition() {
        return getOccupation();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Occupation: " + getOccupation() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Education: " + getEducation() + "\n" +
                "Married: " + (isMarried() ? "Yes" : "No");
    }
}

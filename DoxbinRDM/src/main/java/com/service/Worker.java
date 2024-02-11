package com.service;

public class Worker extends Peoples{
    private String Occupation;
    private final int Salary;
    private String Education;
    private boolean Married;

    public Worker(int id, String name, String surname, boolean gender, int phone, int Salary,String Occupation,String Education,boolean Married,String Address) {
        super(id, name, surname, gender,phone,Address);
        this.Salary = Salary;
        this.Occupation = Occupation;
        this.Education = Education;
        this.Married = Married;
    }
    public String getOccupation() {
        return Occupation;
    }

    public String getPosition(){
        return getOccupation();
    }
    public String getEducation() {
        return Education;
    }
    @Override
    public String toString() {
        return   super.toString() + '\n' +
                "Occupation:'" + getPosition() + '\n' +
                "Salary:" + Salary + '\n'+
                "Education:'" + Education + '\n' +
                "Married:" + (Married ? "No":"Yes")+"\n"
                + "Education:" + getEducation();

    }
}

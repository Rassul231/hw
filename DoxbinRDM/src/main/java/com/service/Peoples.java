package com.service;
public class Peoples {
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private int phone;
    private String Address;

    public Peoples(int id, String name, String surname, boolean gender, int phone, String Address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
        this.Address = Address;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String[] FullAddress(String Address) {
        String[] parts = Address.split(",");
        return parts;
    }

    public String getPosition(){
        return "Do not has job";
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + " - " + (gender ? "man" : "woman") + "\n"
                + getPosition() + "\n" +"ADDRESS:"+ "\n    City:" + FullAddress(Address)[0] + "\n    Street:" + FullAddress(Address)[1] +"\n    Flat:" + FullAddress(Address)[2] ;
    }
}
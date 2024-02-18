package com.service;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Peoples implements Position {
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private long phone;
    private String Address;
    public Peoples(int id, String name, String surname, boolean gender, long phone, String Address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
        this.Address = Address;
    }
    public String[] FullAddress(String Address) {
        if (Address != null) {
            return Address.split(",");
        } else {
            return new String[]{null, null, null};
        }
    }

    public String getPosition() {
        return "Does not have a job";
    }

    @Override
    public String toString() {
        return getId() + ": " + getName() + " " + getSurname() + " - " + (gender ? "man" : "woman") + "\n"
                + getPosition() + "\n" + "Address:" + "\n    City:" + FullAddress(Address)[0] + "\n    Street:" + FullAddress(Address)[1] + "\n    Flat:" + FullAddress(Address)[2];
    }
}

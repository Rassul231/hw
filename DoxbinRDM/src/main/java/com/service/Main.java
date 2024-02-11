package com.service;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to add someone write 'add' ");
        System.out.println("If want find information about someone write 'show'");
        String num = scanner.nextLine();
        if ((num.toLowerCase()).equals("show")) {
            System.out.print("Pleas write number:");
            int n = scanner.nextInt();
            byNumber number = new byNumber();
            number.Find(n);
        } else if (num.equals("add")) {
            System.out.print("Your Person student?");
            String Stud = scanner.nextLine();
            if (Stud.equals("Yes")) {
                System.out.print("Name:");
                String Name = scanner.nextLine();
                System.out.print("SurName:");
                String Surname = scanner.nextLine();
                System.out.print("Gender(Human or women):");
                String Gen = scanner.nextLine();
                Boolean Gender;
                if (Gen.equals("Human")) {
                    Gender = Boolean.TRUE;
                } else {
                    Gender = Boolean.FALSE;
                }
                System.out.print("Phone Number:");
                int Phone = scanner.nextInt();
                System.out.print("Gpa:");
                Float Gpa = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("University:");
                String University = scanner.nextLine();
                System.out.print("Address:");
                String Address = scanner.nextLine();
                System.out.println("Added");
                byNumber number = new byNumber();
                number.Add(Name, Surname, Gender, Phone, 0, null, University, Gpa,null,Boolean.FALSE,Address);
            } else {
                if (Stud.equals("No")){
                    System.out.print("Name:");
                    String Name = scanner.nextLine();
                    System.out.print("SurName:");
                    String Surname = scanner.nextLine();
                    System.out.print("Gender(Human or women):");
                    String Gen = scanner.nextLine();
                    Boolean Gender;
                    if (Gen.equals("Human")) {
                        Gender = Boolean.TRUE;
                    } else {
                        Gender = Boolean.FALSE;
                    }
                    System.out.print("Phone Number:");
                    int Phone = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Do your person has job ?");
                    String Job = scanner.nextLine();
                    if (Job.equals("Yes")) {
                        System.out.print("Occupation");
                        String Occupation = scanner.nextLine();
                        System.out.print("Salary:");
                        int Salaty = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Education");
                        String Education = scanner.nextLine();
                        System.out.print("Is your person merried?");
                        String Merry = scanner.nextLine();
                        System.out.print("Address");
                        String Address = scanner.nextLine();
                        Boolean Married;
                        if (Merry.equals("Yes")) {
                            Married = Boolean.TRUE;
                        } else {
                            Married = Boolean.FALSE;
                        }
                        byNumber number = new byNumber();
                        number.Add(Name,Surname,Gender,Phone,Salaty,Occupation,null, 0.0F,Education,Married,Address);
                    }
                    else{System.out.print("Education");
                        String Education = scanner.nextLine();
                        System.out.print("Is your person married?");
                        String Merry = scanner.nextLine();
                        Boolean Married;
                        if (Merry.equals("Yes")) {
                            Married = Boolean.TRUE;
                        } else {
                            Married = Boolean.FALSE;
                        } System.out.print("Address");
                        String Address = scanner.nextLine();
                        byNumber number = new byNumber();
                        number.Add(Name,Surname,Gender,Phone,0,null,null, 0.0F,Education,Married,Address);
                    }
                }
            }
        }
    }
}
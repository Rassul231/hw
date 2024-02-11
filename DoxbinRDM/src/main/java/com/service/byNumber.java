package com.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class byNumber {
    ArrayList<Peoples> peoples = new ArrayList<>();

    protected void Find(int n) {
        String sql = "SELECT id,name, surname, gender, phone, \"Salary\", \"Occupation\", \"University\", \"Gpa\", \"Education\", \"Married\",\"Address\" FROM public.\"Peoples\" WHERE phone = ?;";
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/edu_reserve_db", "postgres", "2006");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,n);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                boolean gender = rs.getBoolean("gender");
                Float gpa = rs.getFloat("Gpa");
                String University = rs.getString("University");
                int phone = rs.getInt("phone");
                String Occupation = rs.getString("Occupation");
                int Salary = rs.getInt("Salary");
                String Education = rs.getString("Education");
                Boolean Married = rs.getBoolean("Married");
                String Address = rs.getString("Address");
                Peoples Peoples;
                if (University != null) {
                    System.out.println(conn);
                    Peoples = new Student(id, name, surname, gender, gpa, University, phone,Address);
                    peoples.add(Peoples);
                } else if (Occupation != null) {
                    Peoples = new Worker(id, name, surname, gender, phone, Salary, Occupation,Education,Married,Address);
                    peoples.add(Peoples);
                } else {
                    Peoples = new Peoples(id, name, surname, gender, phone,Address);
                    peoples.add(Peoples);
                }
                conn.close();

            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
        for (Peoples peoples : peoples) {
            System.out.println(peoples);
        }

    }

    protected void Add(String Name,String Surname,boolean Gender,int Phone,int Salary,String Occupation,String University,Float Gpa,String Education,Boolean Married,String Address) {
        String sql = "INSERT INTO public.\"Peoples\" (name, surname, gender, phone, \"Salary\", \"Occupation\", \"University\", \"Gpa\",\"Education\",\"Married\",\"Address\") VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?,?);";
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/edu_reserve_db", "postgres", "2006");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Name);
            pstmt.setString(2, Surname);
            pstmt.setBoolean(3, Gender);
            pstmt.setInt(4, Phone);
            pstmt.setInt(5, Salary);
            pstmt.setString(6, Occupation);
            pstmt.setString(7, University);
            pstmt.setFloat(8, Gpa);
            pstmt.setString(9,Education);
            pstmt.setBoolean(10,Married);
            pstmt.setString(11,Address);
            pstmt.executeUpdate();
        }
        catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }

    }
}


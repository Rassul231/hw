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
             pstmt.setLong(1,n);
             ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                boolean gender = rs.getBoolean("gender");
                Float gpa = rs.getFloat("Gpa");
                String University = rs.getString("University");
                long phone = rs.getLong("phone");
                String Occupation = rs.getString("Occupation");
                int Salary = rs.getInt("Salary");
                String Education = rs.getString("Education");
                Boolean Married = rs.getBoolean("Married");
                String Address = rs.getString("Address");
                Peoples Peoples;
                if (University != null) {
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

    protected void Add(String Name,String Surname,boolean Gender,long Phone,int Salary,String Occupation,String University,Float Gpa,String Education,Boolean Married,String Address) {
        String sql = "INSERT INTO public.\"Peoples\" (name, surname, gender, phone, \"Salary\", \"Occupation\", \"University\", \"Gpa\",\"Education\",\"Married\",\"Address\") VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?,?);";
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/edu_reserve_db", "postgres", "2006");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, Name);
                stmt.setString(2, Surname);
                stmt.setBoolean(3, Gender);
                stmt.setLong(4, Phone);
                stmt.setInt(5, Salary);
                stmt.setString(6, Occupation);
                stmt.setString(7, University);
                stmt.setFloat(8, Gpa);
                stmt.setString(9,Education);
                stmt.setBoolean(10,Married);
                stmt.setString(11,Address);
                stmt.executeUpdate();
        }
        catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }

    }
}


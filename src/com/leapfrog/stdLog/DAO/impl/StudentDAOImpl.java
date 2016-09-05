/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.stdLog.DAO.impl;

import com.leapfrog.stdLog.Student;
import com.leapfrog.stdLog.DAOo.StudentDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavit
 */
public class StudentDAOImpl implements StudentDAO {

    @Override
    public int insert(Student student) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver"); //importing Driver
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", null);
        String sql = "insert into register_page(First_Name,Last_Name,Password,Confirm_Password,Email)values(?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        JOptionPane.showMessageDialog(null, "Connection Successful");
        stmt.setString(1, student.getFirstName());
        stmt.setString(2, student.getLastName());
        stmt.setString(3, student.getPassword());
        stmt.setString(4, student.getConfirmPassword());
        stmt.setString(5, student.getEmail());
        
        int result = stmt.executeUpdate();
        conn.close();

        return result;
    }

    
}

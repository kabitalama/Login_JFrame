/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.stdLog.DAOo;

import com.leapfrog.stdLog.Student;
import java.sql.SQLException;

/**
 *
 * @author Kavit
 */
public interface StudentDAO{ 
        int insert(Student student) throws ClassNotFoundException, SQLException  ;
    
}

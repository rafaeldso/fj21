/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafael
 */
public class ConnectionFactory {
    public Connection getConection() {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
            
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
            
    }
}

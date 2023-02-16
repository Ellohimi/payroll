/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PayrollDBConnect
{
 
    Connection conn=null;
    public static Connection ConnecrDb(){
        
    try
    {
        Class.forName("org.sqlite.JDBC");
        Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Hp\\Documents\\NetBeansProjects\\PayRoll_s\\src\\Payroll\\Payroll.sqlite");
        JOptionPane.showMessageDialog(null, "CONECTED TO DATABASE");
        return conn;
    }   
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "CONNECTION FAILURE");
        return null;
         }
       }
    }


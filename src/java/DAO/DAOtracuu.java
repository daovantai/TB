/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;

/**
 *
 * @author VAN TAI
 */
public class DAOtracuu {
    
    private Connection conn;
    private ResultSet rs;
    public DAOtracuu() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAODKDN.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public List<Book> search(String name) throws SQLException {
        List<Book> list=new ArrayList<>();
        try{
        
        String sql="select * from Khosach where name like ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            Book book=new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
            list.add(book);
        }
        
    }catch(Exception e){
        e.printStackTrace(System.out);
    }
    return list;
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Admin
 */
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Login;
import model.TKTT;
import model.User;
public class DAODKDN {
    private Connection conn;
    private ResultSet rs;
    public DAODKDN() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAODKDN.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public int Dangki(User user) throws SQLServerException, SQLException, ClassNotFoundException{
        String ISSql = "INSERT INTO Taikhoan"
                + " (Hovaten, Tendn, Email, Matkhau, Nlmk) VALUES "
                + "(?,?,?,?,?);";
        int res = 0;
       PreparedStatement ps = conn.prepareStatement(ISSql);
       ps.setString(1, user.getHovaten());
       ps.setString(2, user.getTendn());
       ps.setString(3, user.getEmail());
       ps.setString(4, user.getMatkhau());
       ps.setString(5, user.getNmk());
       System.out.println(ps);
       res = ps.executeUpdate();
       return res;
    }
    public boolean layTK(Login s) throws SQLException{
        String sql = "SELECT*FROM Taikhoan WHERE Tendn=? AND Matkhau=? ";
        try{
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setString(1, s.getTendn());
               ps.setString(2, s.getMatkhau());
               rs = ps.executeQuery();
           } catch(Exception e){
               e.printStackTrace();
           }
        return rs.next();
       
    }
    public boolean layTKTT(TKTT s) throws SQLException{
        String sql = "SELECT*FROM TKthuthu WHERE Tendn=? AND Matkhau=? ";
        try{
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setString(1, s.getTendnn());
               ps.setString(2, s.getMatkhauu());
               rs = ps.executeQuery();
           } catch(Exception e){
               e.printStackTrace();
           }
        return rs.next();
       
    }
    
}

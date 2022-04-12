/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Admin
 */
import DAO.DAODKDN;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.SQLException;
import model.Login;
import model.TKTT;

@WebServlet(name="formDn",urlPatterns={"/DN"})
public class UserServletDN extends HttpServlet{
    private final DAODKDN db;
    private String url;
    public UserServletDN() throws SQLException {
        this.db = new DAODKDN();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Tendn = request.getParameter("Tendn1");
        String Matkhau = request.getParameter("Matkhau1");
        Login login = new Login();
        TKTT tt=new TKTT();
        tt.setTendnn(Tendn);
        tt.setMatkhauu(Matkhau);
        login.setTendn(Tendn);
        login.setMatkhau(Matkhau);
       
        try {
            if(db.layTKTT(tt)){
                url="/Thuthu.html";
            }
            else if(db.layTK(login)){
                url = "/user.html";
            }
            else{
                url = "/Dangnhap.html";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        getServletContext().getRequestDispatcher(url).forward(request, response);   
            
    }   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
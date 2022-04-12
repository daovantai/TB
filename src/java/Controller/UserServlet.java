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
import java.util.logging.Level;
import java.util.logging.Logger;

import model.User;
@WebServlet(name = "formDk", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet{
    private final DAODKDN db;
    private String url;

    public UserServlet() throws SQLException {
        this.db = new DAODKDN();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Hovaten = request.getParameter("Hovaten");
        String Tendn = request.getParameter("Tendn");
        String Email = request.getParameter("Email");
        String Matkhau = request.getParameter("Matkhau");
        String Nmk = request.getParameter("Nmk");
        User user = new User(Hovaten, Tendn, Email, Matkhau, Nmk);
        request.setAttribute("user", user);
        if(Nmk.equals(Matkhau)){
            try {
                db.Dangki(user);
                url = "/Dangnhap.html";
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }      
        }
        else{
            url = "/Dangki.html";
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    
    
    
    
}
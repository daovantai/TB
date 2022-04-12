/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
import java.io.*;
public class Login implements Serializable{
    private String Tendn, Matkhau;

    public String getTendn() {
        return Tendn;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setTendn(String Tendn) {
        this.Tendn = Tendn;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }
    
}

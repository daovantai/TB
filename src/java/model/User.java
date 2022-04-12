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
public class User implements Serializable{
    private String hovaten, tendn, email, matkhau, nmk;
    

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setNmk(String nmk) {
        this.nmk = nmk;
    }

    public String getHovaten() {
        return hovaten;
    }

    public String getTendn() {
        return tendn;
    }

    public String getEmail() {
        return email;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public String getNmk() {
        return nmk;
    }

    public User(String hovaten, String tendn, String email, String matkhau, String nmk) {
        this.hovaten = hovaten;
        this.tendn = tendn;
        this.email = email;
        this.matkhau = matkhau;
        this.nmk = nmk;
    }
}

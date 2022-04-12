/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;

/**
 *
 * @author VAN TAI
 */
public class Book implements Serializable{
    private String Masach,Tensach,Tacgia,Nxb,Namxb,Tinhtrang;

    public Book() {
    }

    public Book(String Masach, String Tensach, String Tacgia, String Nxb, String Namxb, String Tinhtrang) {
        this.Masach = Masach;
        this.Tensach = Tensach;
        this.Tacgia = Tacgia;
        this.Nxb = Nxb;
        this.Namxb = Namxb;
        this.Tinhtrang = Tinhtrang;
    }

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String Tensach) {
        this.Tensach = Tensach;
    }

    public String getTacgia() {
        return Tacgia;
    }

    public void setTacgia(String Tacgia) {
        this.Tacgia = Tacgia;
    }

    public String getNxb() {
        return Nxb;
    }

    public void setNxb(String Nxb) {
        this.Nxb = Nxb;
    }

    public String getNamxb() {
        return Namxb;
    }

    public void setNamxb(String Namxb) {
        this.Namxb = Namxb;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }
    
}

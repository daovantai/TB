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
public class TKTT implements Serializable{
    private String Tendnn, Matkhauu;
 

    public TKTT() {
    }

    public TKTT(String Tendnn, String Matkhauu) {
        this.Tendnn = Tendnn;
        this.Matkhauu = Matkhauu;
    }

    public String getTendnn() {
        return Tendnn;
    }

    public void setTendnn(String Tendnn) {
        this.Tendnn = Tendnn;
    }

    public String getMatkhauu() {
        return Matkhauu;
    }

    public void setMatkhauu(String Matkhauu) {
        this.Matkhauu = Matkhauu;
    }

    
    
}

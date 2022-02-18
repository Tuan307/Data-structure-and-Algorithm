/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTFILE2;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Danhba implements Serializable{
    private String ten;
    private String phone;

    public Danhba(String ten, String phone) {
        this.ten = ten;
        this.phone = phone;
    }

    public Danhba() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Danhba{" + "ten=" + ten + ", phone=" + phone + '}';
    }
    
}

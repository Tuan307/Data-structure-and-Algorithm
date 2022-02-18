/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuuFileSerialize;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Khachhang implements Serializable{
    private String ten;
    private int ma;

    public Khachhang() {
    }

    public Khachhang(String ten, int ma) {
        this.ten = ten;
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    
}

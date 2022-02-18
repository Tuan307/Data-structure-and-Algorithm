/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTLUUFILE;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Khachhang implements Serializable{
    private int ma;
    private String ten;
    private String date;

    public Khachhang() {
    }

    public Khachhang(int ma, String ten, String date) {
        this.ma = ma;
        this.ten = ten;
        this.date = date;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Khachhang{" + "ma=" + ma + ", ten=" + ten + ", date=" + date + '}';
    }
    
}

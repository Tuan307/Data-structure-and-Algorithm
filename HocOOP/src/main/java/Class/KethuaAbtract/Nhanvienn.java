/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.KethuaAbtract;

/**
 *
 * @author Asus
 */
public abstract class Nhanvienn {
    int ma;
    String ten;

    public Nhanvienn() {
    }

    public Nhanvienn(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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
    public abstract void tinhLuong();
}

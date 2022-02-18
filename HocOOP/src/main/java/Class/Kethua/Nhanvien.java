/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Kethua;

/**
 *
 * @author Asus
 */
public class Nhanvien {
    protected int ma;
    protected String ten;

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

    public Nhanvien() {
    }

    public Nhanvien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    public void tinhluong()
    {
        System.out.println("Nhan vien goi tinh luong");
    }
}

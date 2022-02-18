/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KethuasortInterface;

/**
 *
 * @author Asus
 */
public class Sanpham implements Comparable<Sanpham>{
    private int ma;
    private String ten;
    private int gia;

    public Sanpham() {
    }

    public Sanpham(int ma, String ten, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sanpham{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + '}';
    }

    @Override
    public int compareTo(Sanpham o) {
        return this.ten.compareToIgnoreCase(o.ten);
    }
    
}

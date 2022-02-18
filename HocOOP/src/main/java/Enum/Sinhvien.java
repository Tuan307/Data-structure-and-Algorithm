/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Asus
 */
public class Sinhvien implements Comparable<Sinhvien>{
    private int ma;
    private String ten;
    private double diemtb;
    private Xeploai loai;

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

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    public Xeploai getLoai() {
        if(diemtb>=8)
            loai=Xeploai.Gioi;
        else if(diemtb>=6.5&&diemtb<8) loai=Xeploai.Kha;
        else loai=Xeploai.Trungbinh;
        return loai;
    }

    public Sinhvien() {
    }

    public Sinhvien(int ma, String ten, double diemtb) {
        this.ma = ma;
        this.ten = ten;
        this.diemtb = diemtb;
        this.loai=getLoai();
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "ma=" + ma + ", ten=" + ten + ", diemtb=" + diemtb + ", loai=" + loai.getDescription() + '}';
    }

    @Override
    public int compareTo(Sinhvien o) {
        if(this.diemtb>o.diemtb) return -1;
        if(this.diemtb<o.diemtb) return 1;
        return 0;
    }
    
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qll;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Sinhvien sv=new Sinhvien();
         LinkedList<Sinhvien> list=new LinkedList<>();
        while(true)
            {
                System.out.println("1.Nhap thong tin");
                System.out.println("2.Tao danh sach rong");
                System.out.println("3.In ra toan bo danh sach");
                System.out.println("4.Xoa sinh vien");
                System.out.println("0.Thoat");
                System.out.println("Moi ban chon chuc nang");
                int choose=Integer.parseInt(sc.nextLine());
                switch(choose)
                {
                    case 0:
                        System.out.println("GoodBye!");
                        System.exit(choose);
                        break;
                    case 1:
                        System.out.println("Nhap ho ten");
                        sv.setHoten(sc.nextLine());
                        System.out.println("Nhap ma sv");
                        sv.setMasv(sc.nextLine());
                        System.out.println("Nhap lop hc");
                        sv.setLophc(sc.nextLine());
                        System.out.println("Nhap diem tb");
                        sv.setDiemtb(Float.parseFloat(sc.nextLine()));
                        list.add(sv);
                        break;
                    case 2:
                       list.clear();
                        break;
                    case 3:
                        for(int i=0;i<list.size();i++)
                        {
                            System.out.println(list.get(i).toString());
                        }
                        break;
                    case 4:
                        for(int i=0;i<list.size();i++)
                        {
                            if(list.get(i).getMasv().equals("18D190206"))
                            {
                                list.remove(i);
                            }
                        }
                        break;
                  
                }
            }
    }
}
class Sinhvien{
   
    private String hoten;
    private String masv;
    private String lophc;
    private float diemtb;

    public Sinhvien(String hoten, String masv, String lophc, float diemtb) {
        this.hoten = hoten;
        this.masv = masv;
        this.lophc = lophc;
        this.diemtb = diemtb;
    }

    public Sinhvien() {
    }
  
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getLophc() {
        return lophc;
    }

    public void setLophc(String lophc) {
        this.lophc = lophc;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "hoten=" + hoten + ", masv=" + masv + ", lophc=" + lophc + ", diemtb=" + diemtb + '}';
    }
    
    
}

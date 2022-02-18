/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapOOP;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Nhanvien nv1=new Nhanvien("T", 350);
        Nhanvien nv2=new Nhanvien("A", 150);
        System.out.println("Luong cua nv1 la: "+nv1.getLuong());
        System.out.println("Luong cua nv2 la: "+nv2.getLuong());
       if(nv1.lonhon(nv2))
       {
           System.out.println("Nhan vien "+nv1.getName() + "nang suat hon "+nv2.getName());
       }
       else
       {
            System.out.println("Nhan vien "+nv2.getName() + "nang suat hon "+nv1.getName());
       }
    }
}

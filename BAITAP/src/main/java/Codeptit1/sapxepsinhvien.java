/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Asus
 */
public class sapxepsinhvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Sinhvien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String masv=sc.nextLine();
            String ht=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            Sinhvien sinhvien=new Sinhvien(masv, ht, lop, email);
            list.add(sinhvien);
        }
        list.sort(new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                if(o1.getLop().compareTo(o2.getLop()) < 0){
                    return -1;
                }
                if(o1.getLop().compareTo(o2.getLop()) == 0 && o1.getMasv().compareTo(o2.getMasv()) < 0){
                    return -1;
                }
                return 1;
            }
        });
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}
class Sinhvien
{
    private String masv,ht,lop,email;

    public Sinhvien(String masv, String ht, String lop, String email) {
        this.masv = masv;
        this.ht = ht;
        this.lop = lop;
        this.email = email;
    }

    public Sinhvien() {
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return masv+" "+ht+" "+lop+" "+email;
    }
    
}

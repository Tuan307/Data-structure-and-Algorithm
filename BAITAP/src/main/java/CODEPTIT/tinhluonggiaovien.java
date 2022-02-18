/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tinhluonggiaovien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String capbac=sc.nextLine();
        String name=sc.nextLine();
        long total=Long.parseLong(sc.nextLine());
        String bac=String.valueOf(capbac.charAt(0))+String.valueOf(capbac.charAt(1));
        long luongtrocap = 0;
        if(bac.equals("HT"))
        {
            luongtrocap=2000000;
        }
        else if(bac.equals("HP"))
        {
            luongtrocap=900000;
        }
        else if(bac.equals("GV"))
        {
            luongtrocap=500000;
        }
        String bacluong=String.valueOf(capbac.charAt(2))+String.valueOf(capbac.charAt(3));
        int bacluongt=Integer.parseInt(bacluong);
        long totalluong=total*bacluongt+luongtrocap;
        giaovien gv=new giaovien(capbac, name, bacluongt,luongtrocap,totalluong);
        System.out.println(gv.toString());
    }
}
class giaovien
{
    private String capbac;
    private String name;
    private long luongcoban;
    private long total;
    private int cap;

    public giaovien(String capbac, String name,int cap,long luongcoban ,long total) {
        this.capbac = capbac;
        this.name = name;
        this.cap=cap;
        this.luongcoban=luongcoban;
        this.total=total;
    }

    @Override
    public String toString() {
        return  this.capbac + " " + this.name + " " + this.cap + " " + this.luongcoban + " " + this.total;
    }

   

   
    
    
}

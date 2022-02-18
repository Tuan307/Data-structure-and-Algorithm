/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tinhtoanphanso {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhanSo p1=new PhanSo(1,1);
        p1.nhap();
        p1.rutGon();
        PhanSo p2=new PhanSo(1,1);
        p2.nhap();
        p2.rutGon();
        PhanSo p3=new PhanSo(1,1);
        p3=p1.congPS(p2);
        p3.rutGon();
        System.out.println(p3);
    }

}
class  PhanSo{
    private long tuso;
    private long mauso;
    static Scanner sc=new Scanner(System.in);

    public  PhanSo() {
    }

    public  PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    private long gcd(long a,long b)
    {
       if(b==0) return a;
       return gcd(b, a%b);
    }
    public void rutGon(){
        long x=gcd(tuso, mauso);
        tuso/=x;
        mauso/=x;
    }
    public PhanSo congPS(PhanSo p) {
	long a = tuso*p.mauso+mauso*p.tuso;
	long b = mauso*p.mauso;
	return new PhanSo(a,b);
	 }
    public void nhap()
    {
        long a=sc.nextLong();
        long b=sc.nextLong();
        this.tuso=a;
        this.mauso=b;
    }

    @Override
    public String toString() {
        return  this.tuso+"/"+this.mauso;
    }
}

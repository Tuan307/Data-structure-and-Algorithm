/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class hoccachamtoanhoc {
    public static void main(String[] args) {
        int a=-5;
        int b=1;
        int c=Math.max(Math.abs(a), b);
        System.out.println(c);
        System.out.println(Math.PI);
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap goc:");
        int goc=sc.nextInt();
        double radian=Math.PI*goc/180;
        double sin=Math.sin(radian);
        double cos=Math.cos(radian);
        System.out.println(sin+" "+cos);
    }
}

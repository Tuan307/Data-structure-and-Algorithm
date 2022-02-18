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
public class PTbacnhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a ==0 && b==0)
        {
            System.out.println("VSN");
        }
        else if(a==0&&b!=0)
        {
            System.out.println("VN");
        }
        else
        {
            float c=(float)(b*-1)/(float)a;
            System.out.printf("%.2f", c);
        }
    }   
}

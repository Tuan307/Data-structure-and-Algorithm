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
public class Songuyento {
    public static boolean Songto(long n)
    {
        if(n<2) return false; 
        for(long i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n=sc.nextLong();
            if(Songto(n)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}

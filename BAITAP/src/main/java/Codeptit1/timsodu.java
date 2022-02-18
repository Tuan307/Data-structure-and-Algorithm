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
public class timsodu {
    public static long reduce(String n)
    {
        long sum=0;
        for(int i=0;i<n.length();i++)
        {
            sum=(sum*10+(int)n.charAt(i)-'0')%4;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s=sc.next();
            long a=reduce(s);
            if(a%4==0) System.out.println("4");
            else System.out.println("0");
            t--;
        }
    }
}
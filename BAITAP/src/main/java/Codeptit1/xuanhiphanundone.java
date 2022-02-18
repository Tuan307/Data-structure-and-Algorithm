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
public class xuanhiphanundone {
    static String check(int n)
    {
        char[] a=new char[n];
        a[1]='0';
        a[2]='1';
        String x3="";
        for(int i=3;i<n;i++)
        {
            
        }
        return x3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String a=check(n);
            System.out.println(a);
        }
    }
}

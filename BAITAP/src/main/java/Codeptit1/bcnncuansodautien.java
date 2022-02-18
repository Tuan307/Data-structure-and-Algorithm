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
public class bcnncuansodautien {
    public static long gcd(long x,long y)
    {
        if(y==0) return x;
        return gcd(y, x%y);
    }
    public static long bcnn(long a,long b)
    {
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long res=1;
            for(long i=1;i<=n;i++)
            {
                res=bcnn(res, i);
            }
            System.out.println(res);
        }
    }
}

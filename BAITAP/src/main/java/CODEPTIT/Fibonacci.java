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
public class Fibonacci {
    static long Fibo(int n)
    {
        long f0=0;
        long f1=1;
        long fn=1;
        if(n<0) return -1;
        else if(n==0||n==1) return n;
        else
        {
            for(int i=2;i<n;i++)
            {
                f0=f1;
                f1=fn;  
                fn=f0+f1;
            }
        }
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            System.out.println(Fibo(n));
            t--;
        }
    }
}

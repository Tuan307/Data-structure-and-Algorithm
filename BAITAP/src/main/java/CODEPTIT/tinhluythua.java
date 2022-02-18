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
public class tinhluythua {
    static long mod=(long) (1e9+7);
    public static long sqr(long x)
    {
        return x*x;
    }
    static long pow(long a,long b)
    {
        if(b==0) return 1%mod;
        else{
            if(b%2==0)
            {
                return sqr(pow(a, b/2))%mod;
            }
            else
            {
                return a*(sqr(pow(a, b/2))%mod)%mod;
            }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0 && b==0)
            {
                break;
            }
            else
            {
                System.out.println(pow(a, b));
            }
        }
    }
}

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
public class Uocsochiahetcho2 {
    static long uocso(long n)
    {
        long dem=0;
        long i=0;
        if(n%2==0) dem++;
        for( i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                if(i%2==0)
                {
                    dem++;
                }
                if((n/i)%2==0) dem++;
            }
        }
        if(i*i==n&&i%2==0)
        {
            dem++;
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n=sc.nextLong();
            System.out.println(uocso(n));
            t--;
        }
    }
}

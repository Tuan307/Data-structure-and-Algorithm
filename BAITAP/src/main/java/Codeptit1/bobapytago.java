/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class bobapytago {
    public static boolean triplet(long a[],int n)
    {
        for(int i=0;i<n;i++)
            {
                a[i]=a[i]*a[i];
            }
        Arrays.sort(a);
        for(int i=n-1;i>=2;i--)
        {
            int l=0;
            int r=i-1;
            while(l<r)
            {
                if(a[l]+a[r]==a[i])
                {
                    return true;
                }
                if(a[l]+a[r]<a[i])
                {
                    l++;
                }
                else r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            boolean ok1=triplet(a, n);
            if(ok1==true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}   
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
public class lietketohop1 {
    static Scanner sc=new Scanner(System.in);
    static int n;
    static int k;
    static int[] a=new int[n+5];
    static boolean ok=true;
    public static void in()
    {
        for(int i=1;i<=k;i++)
        {
            a[i]=i;
        }
    }
    public static void out()
    {
        for(int i=1;i<=k;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void act()
    {
        int i=k;
        while(i>0 &&a[i]==n-k+i) i--;
        a[i]++;
        if(i>0)
        {
            for(int j=i+1;j<=k;j++)
            {
                a[j]=a[i]+j-i;
            }
        }
        else
        {
            ok=false;
        }
    }
    public static void main(String[] args) {
        n=sc.nextInt();
        k=sc.nextInt();
        if(k>2&&k<10&&n>k&&n<10)
        {
        in();
        int count=0;
        while(ok)
        {
            count++;
            out();
            act();
        }
        System.out.println("Tong cong co "+count +" to hop");
    }
    }
}

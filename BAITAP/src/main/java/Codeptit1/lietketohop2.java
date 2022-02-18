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
public class lietketohop2 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    static Scanner sc=new Scanner(System.in);
    static int[] a=new int[100];
    static boolean ok=true;
    public static void in(int n,int k)
    {
        for(int i=1;i<=k;i++)
        {
            a[i]=i;
        }
    }
    public static void out(int n,int k)
    {
        for(int i=1;i<=k;i++)
        {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void act(int n,int k)
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
        int n=sc.nextInt();
        int k=sc.nextInt();
        in(n,k);
        int count=0;
        while(ok)
        {
            count++;
            out(n,k);
            act(n,k);
        }
        System.out.println();
        System.out.println("Tong cong co "+count +" to hop");
    }
}


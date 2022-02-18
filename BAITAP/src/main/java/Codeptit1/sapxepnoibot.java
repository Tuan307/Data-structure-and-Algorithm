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
public class sapxepnoibot {
     static boolean check(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("Buoc "+(i+1)+": ");
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int x=a[j];
                    a[j]=a[j+1];
                    a[j+1]=x;
                }
            }
            for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
           if(check(a, n)){
               break;
           }
            System.out.println();
        }
    }
}

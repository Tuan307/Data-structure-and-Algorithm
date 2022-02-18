/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class sapxepnoibotnguoc {
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
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String s="";
                s+="Buoc "+String.valueOf(i+1)+": ";
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
                    s=s+a[k]+" ";
                }
                list.add(s);
               if(check(a, n)){
                   break;
               }
            }
            for(int i=list.size()-1;i>=0;i--)
            {
                System.out.println(list.get(i));
            }
        }
    }
}

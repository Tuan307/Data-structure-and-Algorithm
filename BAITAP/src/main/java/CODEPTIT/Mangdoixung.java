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
public class Mangdoixung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            boolean ok=true;
            for(int i=0;i<n/2;i++)
            {
                if(a[i]!=a[n-i-1])
                {
                    ok=false;
                }
            }
            if(!ok) System.out.println("NO");
            else System.out.println("YES");
            t--;
        }
    }
}

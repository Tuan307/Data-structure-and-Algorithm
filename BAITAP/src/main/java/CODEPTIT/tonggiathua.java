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
public class tonggiathua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long res=1;
        long sum=0;
       for(int i=1;i<=n;i++)
       {
           res=1;
           for(int j=1;j<=i;j++)
           {
               res*=j;
           }
           sum+=res;
       }
        System.out.println(sum);
    }
}

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
public class Phantichthuasongto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n=sc.nextInt();
            System.out.printf("Test "+j+": ");
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                int dem=0;
                while(n%i==0)
                {
                    dem++;
                    n/=i;
                }
                if(dem!=0)
                {
                    System.out.printf(i+"("+dem+") ");
                }
            }
            if(n!=1)
            {
                System.out.printf(n+"("+1+")");
                System.out.println();
            }
        }
}
}

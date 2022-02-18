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
public class inmatran {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            
            int n=sc.nextInt();
            int[] a=new int[n*n];
            int[][] b=new int[n][n];
            for(int i=0;i<n*n;i++)
            {
                a[i]=sc.nextInt();   
            }
            int k=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                   b[i][j]=a[k++];
                }
                
            }
            for(int i=0;i<n;i++)
            {
                if(i%2==0){
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(b[i][j]+" ");
                    }
                }
                else
                {
                    for(int j=n-1;j>=0;j--)
                    {
                        System.out.print(b[i][j]+" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}

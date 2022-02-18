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
public class danhsachke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] a=new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++)
        {
             System.out.print("List("+i+") = ");
            for(int j=1;j<=n;j++)
            {
                if(a[i][j]==1){
                System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}

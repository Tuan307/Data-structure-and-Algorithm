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
public class tichmatranchuyenvi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        int t=sc.nextInt();
        int k1=1;
        while(t>0)
        {
            int row=sc.nextInt();
            int col=sc.nextInt();
            int [][] a=new int[row][col];
            int [][] b=new int[col][row];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<col;i++)
            {
                for(int j=0;j<row;j++)
                {
                    b[i][j]=a[j][i];
                }
            }
             int [][] c=new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    for (int k = 0; k < col; k++)
                        c[i][j] += a[i][k] * b[k][j];
                }
            }
            System.out.println("Test "+k1+":");
            for(int i=0;i<row;i++)
            {
                for(int j =0;j<row;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            k1++;
            t--;
        }
    }
    /*
     
    }
    */
}

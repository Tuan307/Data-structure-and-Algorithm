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
public class matrannhiphan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            int checkko=0;
            int check1=0;
            for(int j=0;j<3;j++)
            {
                if(a[i][j]==0)
                {
                    checkko+=1;
                }
                else{
                    check1+=1;
                }
            }
            if(check1>checkko)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

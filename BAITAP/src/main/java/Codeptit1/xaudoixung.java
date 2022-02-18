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
public class xaudoixung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String n=sc.nextLine();
            char[] arr=n.toCharArray();
            int count=0;
            for(int i=0;i<arr.length/2;i++)
            {
                if(arr[i]!=arr[n.length()-i-1])
                {
                    count++;
                }
            }
            if(n.length()%2==0)
            {
                if(count==1) System.out.println("YES");
                else System.out.println("NO");
            }
            else
            {
                if(count<=1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}

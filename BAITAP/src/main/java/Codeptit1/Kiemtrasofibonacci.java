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
public class Kiemtrasofibonacci {
    public static void main(String[] args) {
        ArrayList<Long> arr=new ArrayList<>();
        arr.add((long)(0));
        arr.add((long)1);
        for(int i=2;i<=100;i++)
        {
            long a=arr.get(i-2);
            long b=arr.get(i-1);
            arr.add(a+b);
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            boolean checkpoint=false;
            long n=sc.nextLong();
            for(int j=0;arr.get(j)<=n;j++)
            {
                if(arr.get(j)==n)
                {
                    checkpoint=true;
                    System.out.println("YES");
                    break;
                }
            }
            if(checkpoint==false)
            {
                System.out.println("NO");
            }
        }
    }
}

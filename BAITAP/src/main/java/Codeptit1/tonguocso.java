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
public class tonguocso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum1=0;
        while(t>0)
        {
            int n=sc.nextInt();
            int sum=0;
            int i=2;
            while(n>1)
            {
                if(n%i==0)
                {
                    sum+=i;
                    n/=i;
                }
                else
                {
                    i++;
                }
            }
            sum1+=sum;
            t--;
        }
        System.out.println(sum1);
    }
}
/*
package nmt.ptit;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            int res = 0;
            if (n % 2 == 0) {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if (i % 2 == 0) res++;
                        if ((n / i) % 2 == 0) res++;
                    }
                }
                double temp = Math.sqrt(n);
                if (temp - Math.floor(temp) == 0) {
                    res--;
                }
                res++;
            }
            System.out.println(res);
        }
    }
}

*/

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
public class uclncuabignum {
    static int reduce(int a,String b)
    {
        int res=0;
        for(int i=0;i<b.length();i++)
        {
            res=(res*10+b.charAt((int) i)-'0')%a;
        }
        return res;
    }
    static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            int a=sc.nextInt();
            String b=sc.next();
            int numb=reduce(a, b);
            System.out.println(gcd(a, numb));
            t--;
        }
    }
}

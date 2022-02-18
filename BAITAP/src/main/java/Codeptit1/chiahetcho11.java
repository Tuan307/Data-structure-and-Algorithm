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
public class chiahetcho11 {
    public static int reduce(String n)
    {
        int sum=0;
        for(int i=0;i<n.length();i++)
        {
            sum=(sum*10+n.charAt((int)i)-'0')%11;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test>0)
        {
            String s=sc.nextLine();
            int a=reduce(s);
            if(a%11==0) System.out.println("1");
            else System.out.println("0");
            test--;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class bcnn {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String a=sc.nextLine();
            BigInteger s1=new BigInteger(a);
             String b=sc.nextLine();
            BigInteger s2=new BigInteger(b);
            BigInteger mul=s1.multiply(s2);
            BigInteger g=s1.gcd(s2);
            System.out.println(mul.divide(g));
        }
    }
}

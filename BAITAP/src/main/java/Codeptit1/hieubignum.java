/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import static java.awt.PageAttributes.MediaType.C1;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class hieubignum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a=sc.next();
            String b=sc.next();
            BigInteger a1=new BigInteger(a);
            BigInteger b1=new BigInteger(b);
            BigInteger c1=a1.subtract(b1);
            c1=c1.abs();
            String d=""+c1;
            while(a.length()>d.length()) d="0"+d;
            while(b.length()>d.length()) d="0"+d;
            System.out.println(d);
            t--;
        }
    }
}

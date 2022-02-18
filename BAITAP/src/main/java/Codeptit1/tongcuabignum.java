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
public class tongcuabignum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a=sc.next();
            String b=sc.next();
            BigInteger a1=new BigInteger(a);
            BigInteger b1=new BigInteger(b);
            System.out.println(a1.add(b1));
            t--;
        }
    }
}

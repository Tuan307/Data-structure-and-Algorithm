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
public class kiemtrachiahet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0) {            
             String s=sc.nextLine();
            String[] arr=s.split(" ");
            BigInteger s1=new BigInteger(arr[0]);
            BigInteger s2=new BigInteger(arr[1]);
            BigInteger a=s1.divide(s2);
            
            BigInteger mul=a.multiply(s2);
            if(mul.equals(s1))
            {
                System.out.println("YES");
            }
            else
            {
                BigInteger a1=s2.divide(s1);
                BigInteger mul1=a1.multiply(s1);
                if(mul1.equals(s2))
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
                
        }
    }
}

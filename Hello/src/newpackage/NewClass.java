/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Asus
 */
public class NewClass {
       
   static BigInteger factorial(int n){
        BigInteger product=BigInteger.ONE;
        for(int i=2; i<=n; i++){
            product= product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(factorial(n));
}
}

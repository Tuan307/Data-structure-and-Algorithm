/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Asus
 */
public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        Set<Character> myset=new HashSet<Character>();
        for(int i=0;i<a.length;i++)
        {
            myset.add(a[i]);
        }
        System.out.println(myset.size());
    }
}

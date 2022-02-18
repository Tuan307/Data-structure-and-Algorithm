/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Asus
 */
public class tapturiengcua2xau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String a=sc.nextLine();
            String b=sc.nextLine();
            String[] n1=a.split(" ");
            Set<String> a1=new TreeSet<>();
            for(int i=0;i<n1.length;i++)
            {
                if(b.contains(n1[i])==false)
                {
                    a1.add(n1[i]);
                }
            }
            for(String a3:a1)
            {
                System.out.print(a3+" ");
            }
            System.out.println();
        }
    }
    
}

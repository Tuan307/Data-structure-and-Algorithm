/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Asus
 */
public class Solanxuathien {
    public static void countFre(ArrayList<Integer> list)
    {
        Set<Integer> st=new HashSet<Integer>(list);
        for(int s:st)
        {
            System.out.println(s+" xuat hien "+Collections.frequency(list, s)+" lan");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                a.add(x);
            }
            countFre(a);
           
            t--;
        }
    }
}

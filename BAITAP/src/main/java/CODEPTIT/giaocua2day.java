/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Asus
 */
public class giaocua2day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int tmp=sc.nextInt();
            set1.add(tmp);
        }
        Set<Integer> union=new HashSet<Integer>(set1);
        for(int i=0;i<m;i++)
        {
            int tmp=sc.nextInt();
            set2.add(tmp);
        }
        union.addAll(set2);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(union);
        Collections.sort(list3);
        for(int i:list3)
        {
            System.out.print(i+" ");
        }
        
    }
}

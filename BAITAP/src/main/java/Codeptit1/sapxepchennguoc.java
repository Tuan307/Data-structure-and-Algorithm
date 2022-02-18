/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class sapxepchennguoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String s="";
            s+="Buoc "+String.valueOf(i)+": ";
            list.add(a[i]);
            Collections.sort(list);
            for(int j=0;j<list.size();j++)
            {
                s+=String.valueOf(list.get(j))+" ";
            }
            list1.add(s);
        }
        for(int i=list1.size()-1;i>=0;i--)
        {
            System.out.println(list1.get(i));
        }
    }
}

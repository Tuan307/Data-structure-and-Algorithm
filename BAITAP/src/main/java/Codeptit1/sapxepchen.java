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
public class sapxepchen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Buoc "+i+": ");
            list.add(a[i]);
            Collections.sort(list);
            for(int j=0;j<list.size();j++)
            {
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
}

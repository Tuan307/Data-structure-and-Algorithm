/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class capsocotongbangk {
    public static long gerPair(long a[],int n,long k)
    {
        HashMap<Long,Long> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i], Long.valueOf(0));
            }
            hm.put(a[i], hm.get(a[i])+1);
        }
        long count=0;
        for(int i=0;i<n;i++)
        {
            if(hm.get(k-a[i])!=null)
            {
                count+=hm.get(k-a[i]);
            }
            if(k-a[i]==a[i])
            {
                count--;
            }
        }
        return count/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            long[] a=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            long result=gerPair(a, n, k);
            System.out.println(result);
        }
    }
}

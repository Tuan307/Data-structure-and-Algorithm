/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class NineandZero {
    static int max_count=10000;
    static List<String> list=new LinkedList<>();
    static void modify()
    {
        Queue<String> queue=new LinkedList<>();
        queue.add("9");
        for(int i=max_count;i>0;i--)
        {
            String s1=queue.peek();
            queue.remove();
            list.add(s1);
            String s2=s1;
            queue.add(s1+"0");
            queue.add(s2+"9");
        }
    }
    static String findSmallestMultiple(int n) 
    {
       
        for(int i=0;i<list.size();i++)
        {
            if(Integer.valueOf(list.get(i))%n==0)
            {
                return list.get(i);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        int t=sc.nextInt();
        while(t-->0)
        {   list.clear();
            modify();
            
            int n=sc.nextInt();
            System.out.println(findSmallestMultiple(n));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class bt1 {
 
    public static String angryProfessor(int k, int[] a) {
            int count=0;
            for(int i=0;i<a.length;i++)
            if(a[i]<=0)
            {
                count++;
            }
          if(count>=k) return "NO";
          else return "YES";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(angryProfessor(k,arr));
        t--;
        }
        //scanner.close();
    }
}
       
   


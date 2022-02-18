/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class rutgonkytu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            if(count>=2)
            {
                 int flag=0;
                    for(int j=i+1;j>=0;j--)
                    {
                        if(flag==2) break;
                        arr[j]='0';
                        flag++;
                    }
                    count=1;
            }
            if(arr[i]!=arr[i+1])
            {
                count=1;
            }
        }
        boolean ok=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='0')
            {
                System.out.print(arr[i]);
                ok=true;
            }
        }
        if(!ok) System.out.println("Empty String");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocString;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Asus
 */
public class BT3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String st="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='-')
            {
                st+=s.charAt(i);
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)>='0'&&s.charAt(j)<='9')
                    {
                        st+=s.charAt(j);
                        i=j;
                    }
                    else break;
                }
                System.out.print(st+" ");
                st="";
            }
        }
    }
}

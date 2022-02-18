/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class sodep3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s=sc.next();
            boolean ok=false;
            int len=s.length();
            for(int i=0;i<len/2;i++)
            {
               
                if((s.charAt(i)-'0')==(s.charAt(len-1-i)-'0')&&(s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='5'||s.charAt(i)=='7'))
                {
                    ok=true;
                }
                else{
                    ok=false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}

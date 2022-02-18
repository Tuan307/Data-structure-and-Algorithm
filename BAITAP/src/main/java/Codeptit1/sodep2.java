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
public class sodep2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int sum=0;
            String s=sc.next();
            boolean ok=false;
            int len=s.length();
            for(int i=0;i<len/2;i++)
            {
                if((s.charAt(i)-'0')!=8&&(s.charAt(len-1)-'0')!=8)
                {
                    ok=false;
                    break;
                }
                if((s.charAt(i)-'0')==(s.charAt(len-1-i)-'0'))
                {
                    ok=true;
                    sum+=(int)(s.charAt(i)-'0');
                }
                else{
                    ok=false;
                    break;
                }
            }
            boolean ok1=false;
            if(sum%10==0) ok1=true;
            
            if(ok&&ok1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}

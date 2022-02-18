/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class maycucgach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t>0)
        {
          
            String s=sc.nextLine();
            s=s.toUpperCase();
            String res="";
            for (int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A'&&s.charAt(i)<='C')
                {
                    res+='2';
                }
                else if(s.charAt(i)>='D'&&s.charAt(i)<='F')
                {
                    res+='3';
                }
                else if(s.charAt(i)>='G'&&s.charAt(i)<='I')
                {
                    res+='4';
                }
                else if(s.charAt(i)>='J'&&s.charAt(i)<='L')
                {
                    res+='5';
                }
                else if(s.charAt(i)>='M'&&s.charAt(i)<='O')
                {
                    res+='6';
                }
                else if(s.charAt(i)>='P'&&s.charAt(i)<='S')
                {
                    res+='7';
                }
                else if(s.charAt(i)>='T'&&s.charAt(i)<='V')
                {
                    res+='8';
                }
                else if(s.charAt(i)>='W'&&s.charAt(i)<='Z')
                {
                    res+='9';
                }
            }
            
            StringBuilder sb=new StringBuilder(res);
            sb.reverse();
            
            if(res.equals(sb.toString()))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--;
        }
    }
}

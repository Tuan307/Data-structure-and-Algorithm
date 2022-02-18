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
public class catdoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t>0)
        {
            boolean ok=true;
            String s=sc.nextLine();
            for (int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='8'&&s.charAt(i)!='9')
                {
                    ok=false;
                }
            }
            String res="";
            if(ok==false)
            {
                System.out.println("INVALID");
            }
            else
            {
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='0')
                    {
                        res+='0';
                    }
                    else if(s.charAt(i)=='1')
                    {
                        res+='1';
                    }
                     else if(s.charAt(i)=='8')
                    {
                        res+='0';
                    }
                     else if(s.charAt(i)=='9')
                    {
                        res+='0';
                    }
                }
                if(Long.parseLong(res)==0)
                {
                    System.out.println("INVALID");
                }
                else {
                    long result=Long.parseLong(res);
                    System.out.println(String.valueOf(result));
                }
            }
            t--;
        }
    }
}

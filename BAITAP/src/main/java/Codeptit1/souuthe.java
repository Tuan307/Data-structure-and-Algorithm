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
public class souuthe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String a=sc.nextLine().toLowerCase();
            boolean ok=false;
            boolean ok1=true;
            for(int i=0;i<a.length();i++)
            {
                if((a.charAt(i)>='a'&&a.charAt(i)<='z')||a.charAt(0)=='0')
                {
                    ok1=false;
                    break;
                }
            }
            if(ok1==false)
            {
                System.out.println("INVALID");
            }
            else
            {
                int chan=0;
                int le=0;
                if(a.length()%2==0)
                {
                   for(int i=0;i<a.length();i++){
                        if(Integer.valueOf(a.charAt(i))%2==0)
                        {
                            chan++;
                        }
                        else
                        {
                            le++;
                        }
                    }
                if(chan>le)
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                }
                else{
                      for(int i=0;i<a.length();i++){
                        if(Integer.valueOf(a.charAt(i))%2==0)
                        {
                            chan++;
                        }
                        else
                        {
                            le++;
                        }
                    }
                if(chan<le)
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }   
            }
            }
        }
    }
}

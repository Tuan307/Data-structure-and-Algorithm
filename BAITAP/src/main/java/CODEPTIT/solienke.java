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
public class solienke {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s=sc.nextLine();
            boolean ok=true;
            for(int i=0;i<s.length()-1;i++)
            {
                if(Math.abs(Integer.valueOf(s.charAt(i))-Integer.valueOf(s.charAt(i+1)))!=1)
                {
                    ok=false;
                }
            }
            if(ok==false)
            {
                System.out.println("NO");
            }
            else
            {
                    System.out.println("YES");
               
            }
        }
    }
}

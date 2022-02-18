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
public class sotamphan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            boolean ok=true;
                String s=sc.nextLine();
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2')
                    {
                        ok =false;
                        break;
                    }
                }
                if(ok) System.out.println("YES");
                else{
                    System.out.println("NO");
                }
        }
    }
}

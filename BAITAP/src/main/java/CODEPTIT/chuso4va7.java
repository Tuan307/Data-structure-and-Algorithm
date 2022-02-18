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
public class chuso4va7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count_4=0;
        int count_7=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='4')
            {
                count_4+=1;
            }
            else if(s.charAt(i)=='7')
            {
                count_7+=1;
            }
        }
        if((count_4+count_7)==4||(count_4+count_7)==7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}

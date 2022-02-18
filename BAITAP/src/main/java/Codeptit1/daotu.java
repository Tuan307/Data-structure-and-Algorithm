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
public class daotu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s=sc.nextLine();
            String[] s1=s.split(" ");
            for(String a:s1){
                StringBuilder sb=new StringBuilder(a);
                System.out.print(sb.reverse()+" ");
            }
            System.out.println("");
        }
    }
}

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
public class diachiemailchuaxong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->=0)
        {
            String name=sc.nextLine();
            name=name.toLowerCase();
            name=name.replaceAll("\\s\\s+"," ");
            String[] a=name.split(" ");
            System.out.print(a[a.length-1]);
            for(int i=0;i<a.length-1;i++)
            {
                System.out.print(a[i].charAt(0));
            }
            System.out.println("@ptit.edu.vn");
        }
    }
}

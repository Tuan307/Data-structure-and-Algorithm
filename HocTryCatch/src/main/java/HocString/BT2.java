/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocString;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BT2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String s2=sb.reverse().toString();
        if(s.equals(s2))
        {
            System.out.println("is Pen");
        }
        else System.out.println("Not pen");
    }
}

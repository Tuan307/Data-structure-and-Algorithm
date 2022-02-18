/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class xulysorandom {
    public static void choi()
    {
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        int x=rd.nextInt(101);
        System.out.println("Moi nhap vao so:");
        int y=sc.nextInt();
        int count=1;
        while(count>0)
        {
            if(y==x)
            {
                System.out.println("Ban da doan dung");
                break;
            }
            else if(y>x)
            {
                System.out.println("So ban nhap lon hon so da cho, moi nhap lai");
                int z=sc.nextInt();
                y=z;
            }
            else 
            {
                System.out.println("So ban nhap be hon so da cho, moi nhap lai");
                int z=sc.nextInt();
                y=z;
            }
            count--;
        }
        if(count==0) System.out.println("Game Over!!!, so can tim la: "+x);
    }
    public static void main(String[] args) {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            choi();
            System.out.println("Ban co muon choi lai khong(c/k) ");
            String t=sc.nextLine();
            if(t.equals("k"))
            {
                break;
            }
    }
    }
}

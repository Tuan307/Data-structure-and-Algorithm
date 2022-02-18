/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HocArrayList {
    static ArrayList<Integer> ds=new ArrayList<>();
    public static void menu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:Them");
        System.out.println("2:Xuat");
        System.out.println("3:Sua");
        System.out.println("4:Xoa");
        System.out.println("5:Tim Kiem");
        System.out.println("6:Sap Xep");
        System.out.println("7:Thoat");
         System.out.println("Moi ban chon:");
        int chon=sc.nextInt();
        switch(chon)
        {
            case 1 -> them();
            case 2 -> xuat();
            case 3 -> sua();
            case 4 -> xoa();
            case 5 -> timkiem();
            case 6 -> sapxep();
            case 7 -> {
                System.out.println("Cam on!");
                System.exit(0);
            }
            default -> System.out.println("Moi chon lai");
                
        }
    }
    public static void them()
    {
         System.out.println("Nhap so gia tri muon them");
         int n=new Scanner(System.in).nextInt();
         for(int i=0;i<n;i++)
         {
        System.out.println("Nhap gia tri muon them");
        int value=new Scanner(System.in).nextInt();
        ds.add(value);
         }  
    }
    public static void xuat()
    {
        for(int i=0;i<ds.size();i++)
        {
            System.out.print(ds.get(i)+" ");
        }
        System.out.println("\n");
    }
     public static void sua()
    {
        System.out.println("Nhap vi tri muon sua");
        int key=new Scanner(System.in).nextInt();
        System.out.println("Gia tri moi");
        int value=new Scanner(System.in).nextInt();
        ds.set(key, value);
    }
      public static void xoa()
    {
        System.out.println("Nhap vi tri muon xoa");
        int key=new Scanner(System.in).nextInt();
        ds.remove(key);
    }
        public static void timkiem()
    {
        System.out.println("Nhap so can tim");
        int key=new Scanner(System.in).nextInt();
        if(ds.contains(key))
        {
            System.out.println("Co");
        }
        else System.out.println("Khong co");
    }
         public static void sapxep()
    {
        Collections.sort(ds);
    }
    public static void main(String[] args) {
        while(true)
        {
            menu();
        }
        
    }
}

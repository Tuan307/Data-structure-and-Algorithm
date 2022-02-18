/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTLUUFILE;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainTest {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Khachhang> list=new ArrayList<>();
    public static void menu()
    {
        System.out.println("1:nhap");
        System.out.println("2:xuat");
        System.out.println("3.Luu");
        System.out.println("4:Mo");
        System.out.println("5:Thoat");
        //Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                luu();
                break;
            case 4:
                mo();
                break;
            case 5:
                System.out.println("GoodBye!");
                System.exit(0);
                break;
            default:
                System.out.println("Nhap lai");
                break;  
        }
    }
    public static void nhap()
    {
        System.out.println("Nhap ma");
        int ma=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten");
        String name=sc.nextLine();
        System.out.println("Nhap nam sinh");
        String date=sc.nextLine();
        Khachhang kh=new Khachhang(ma, name, date);
        list.add(kh);
    }
    public static void xuat()
    {
        for (Khachhang kh:list)
        {
            System.out.println(kh);
        }
    }
    public static void luu()
    {
        if (TestFileFactory.saveFile(list,"D:/dskh1.txt")==true)
        {
            System.out.println("Luu file thanh cong");
        }
        else System.out.println("Luu file that bai");
    }
    public static void mo()
    {
        list=TestFileFactory.doc("D:/dskh1.txt");
        for(Khachhang kh:list)
        {
            System.out.println(kh);
        }
    }
    public static void main(String[] args) {
        while(true)
        {
            menu();
        }
    }
}

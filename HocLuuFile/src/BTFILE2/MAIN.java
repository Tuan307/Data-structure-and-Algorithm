/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTFILE2;

import BTLUUFILE.Khachhang;
import BTLUUFILE.TestFileFactory;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.IIOException;

/**
 *
 * @author Asus
 */
public class MAIN {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Danhba> list=new ArrayList<>();
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
        sc.nextLine();
        System.out.println("Nhap ten");
        String name=sc.nextLine();
        System.out.println("Nhap so dien thoai");
        String date=sc.nextLine();
        Danhba danhba=new Danhba(name, date);
        list.add(danhba);
    }
    public static void xuat()
    {
        for (Danhba kh:list)
        {
            System.out.println(kh);
        }
    }
    public static void luu()    
    {
        if (FileFactory.saveFile(list,"D:/dskh1.txt")==true)
        {
            System.out.println("Luu file thanh cong");
        }
        else System.out.println("Luu file that bai");
    }
    public static void mo()
    {
        try {
         list=FileFactory.doc("D:/dskh1.txt");
        for(Danhba kh:list)
        {
            System.out.println(kh);
        }   
        } catch (Exception e) {
//            doc();
        }
    }
//    public static void doc()
//       {
//        try {
//            String url="D:/dskh1.txt";
//            FileInputStream fis=new FileInputStream(url);
//            InputStreamReader isr=new InputStreamReader(fis);
//            BufferedReader br=new BufferedReader(isr); 
//            String line=br.readLine();
//            while(line!=null)
//            {
//                System.out.println(line);
//                line=br.readLine();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//       }
    public static void main(String[] args) throws IOException{
        while (true){
            menu();
            
        }
    }
}

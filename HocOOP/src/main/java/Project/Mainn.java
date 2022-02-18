/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Asus
 */
public class Mainn {
    static Scanner sc=new Scanner(System.in);
    static HashMap<Integer,Danhba> danhba=new HashMap<>();
    public static void menu()
    {
        System.out.println("1.Them");
        System.out.println("2.Xuat");
        System.out.println("3.Sua");
        System.out.println("4.Xoa");
        System.out.println("5.Tim");
        System.out.println("6.Sapxep");
        System.out.println("7.Luu File");
        System.out.println("8.Doc File");
        System.out.println("9.Thoat");
        System.out.println("Moi ban chon: ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                them();
                break;
            case 2:
                xuat();
                break;
            case 3:
                sua();
                break;
            case 4:
                xoa();
                break;
            case 5:
                tim();
                break;
            case 6:
                sapxep();
                break;
            case 7:
                Luufile();
                break; 
            case 8:
                Docfile();
                break;
            case 9:
                System.out.println("GoodBye!");
                System.exit(0);
                break;
        
        }
    }

    private static void them() {
        System.out.println("Nhap ma ");
        int ma=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten");
        String name=sc.nextLine();
        System.out.println("Nhap so dien thoai");
        String phone=sc.nextLine();
        Danhba db=new Danhba(name, phone, ma);
        if(danhba.containsKey(db.getId())==false)
        {
            danhba.put(db.getId(),db);
        }
    }

    private static void xuat() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Danh sach danh ba: ");
        for (Map.Entry<Integer, Danhba> entry : danhba.entrySet()) {
            //Object key = entry.getKey();
            System.out.println(entry.getValue());
            
        }
    }

    private static void sua() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap ma muon sua");
        int ma=sc.nextInt();
        if(danhba.containsKey(ma))
        {
            sc.nextLine();
            System.out.println("Nhap ten");
            String name=sc.nextLine();
            System.out.println("Nhap so dien thoai");
            String phone=sc.nextLine();
            Danhba db=new Danhba(name, phone, ma);
            danhba.put(ma, db);
        }
        else System.out.println("Ma khong ton tai");
    }

    private static void xoa() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap ma");
        int ma=sc.nextInt();
        if(danhba.containsKey(ma))
        {
            danhba.remove(ma);
        }
        else System.out.println("khong tim thay ma");
    }

    private static void tim() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap so phone");
        String phone=sc.nextLine();
        for (Map.Entry<Integer, Danhba> entry : danhba.entrySet()) {
            if(entry.getValue().getPhone().startsWith(phone)){
            Object val = entry.getValue();
            }
            
        }
    }

    private static void sapxep() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TreeMap<Integer,Danhba> sorted=new TreeMap<>();
        sorted.putAll(danhba);
    }

    private static void Docfile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        danhba=Luufile.doc("D:/BTDANHBA.txt");
    }

    private static void Luufile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Luufile.savefile(danhba,"D:/BTDANHBA.txt");
        
    }
    public static void main(String[] args) {
        while(true)
        {
            menu();
        }
    }
}
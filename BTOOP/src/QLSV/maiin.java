/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class maiin {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Student> students=new ArrayList<>();
    static void menu()
    {
        System.out.println("1.Nhap vao n sinh vien");
        System.out.println("2.Hien thi danh sach sinh vien");
        System.out.println("3.Hien thi sinh vien co diem cao nhat va sinh vien diem thap nhat");
        System.out.println("4.Tim kiem theo ma sinh vien");
        System.out.println("5.Hien thi danh sach sinh vien theo ten chu cai");
        System.out.println("6.Hien thi danh sach sinh vien duoc hoc bong theo tren xuong");
        System.out.println("7.Thoat");
        int choose=Integer.parseInt(sc.nextLine());
        switch(choose)
        {
            case 1:
                nhap();
                break;
            case 2:
                hienthi();
                break;
            case 3:
                hienthisvdiemcaovathap();
                break;
            case 4:
                timkiem();
                break;
            case 5:
                sapxepsv();
                break;
            case 6:
                dssvhb();
                break;
            case 7:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
        }
    }

    private static void nhap() {
        System.out.println("Nhap vao so sinh vien");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            Student s=new Student();
            s.input();
            students.add(s);
        }
    }

    private static void hienthi() {
        for(int i=0;i<students.size();i++)
        {
            students.get(i).output();
        }
    }

    private static void hienthisvdiemcaovathap() {
        double max=-99;
        double min=99;
        int flag=0,flag1=0;
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getGpa()>max)
            {
                max=students.get(i).getGpa();
                flag=i;
            }
        }
        System.out.println("Sinh vien co diem cao nhat la: ");
        students.get(flag).output();
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getGpa()<min)
            {
                min=students.get(i).getGpa();
                flag1=i;
            }
        }
        System.out.println("Sinh vien co diem thap nhat la :");
        students.get(flag1).output();
    }

    private static void timkiem() {
        System.out.println("Nhap ma ban can tim");
        String ma=sc.nextLine();
        boolean ok=false;
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getId().equalsIgnoreCase(ma))
            {
                students.get(i).output();
                ok=true;
            }
        }
        if(!ok) System.out.println("Khong tim thay ma");
    }

    private static void sapxepsv() {
       Collections.sort(students);
    }

    private static void dssvhb() {
        Collections.sort(students, Student.diem);   
    }
    public static void main(String[] args) {
        while (true) {            
            menu();
        }
    }
}

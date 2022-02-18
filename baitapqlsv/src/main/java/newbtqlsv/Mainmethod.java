/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbtqlsv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Mainmethod {
    public static void main(String[] args) {
        ArrayList<Student> studentlist=new ArrayList<>();
        int choose;
        Scanner sc=new Scanner(System.in);
        do
        {
            showMenu();
            System.out.println("Choose: ");
            choose=Integer.parseInt(sc.nextLine());
                    
            switch(choose)
            {
                case 1:
                    int n;
                    System.out.println("Nhap so sinh vien can them: ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++)
                    {
                        Student std=new Student();
                        std.inputInfo();
                        studentlist.add(std);
                    }
                    break;
                case 2:
                    for(int i=0;i<studentlist.size();i++)
                    {
                        studentlist.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minin=0;
                    int maxin=0;
                    double minMark=studentlist.get(0).getMark();
                    double maxMark=studentlist.get(0).getMark();
                    for(int i=1;i<studentlist.size();i++)
                    {
                        if(studentlist.get(i).getMark()<minMark)
                        {
                            minin=i;
                            minMark=studentlist.get(i).getMark(); 
                        }
                         if(studentlist.get(i).getMark()>maxMark)
                        {
                            maxin=i;
                            maxMark=studentlist.get(i).getMark(); 
                        }
                    }
                    System.out.println("Sinh vien co diem trung binh cao nhat la: ");
                    studentlist.get(maxin).showInfo();
                    System.out.println("Sinh vien co diem trung binh thap nhat la ");
                    studentlist.get(minin).showInfo();
                    break;
                case 4:
                    System.out.println("Nhap ma sinh vien va tim kiem ");
                    String masvSearch=sc.nextLine();
                    int count=0;
                    for(int i=0;i<studentlist.size();i++)
                    {
                        if(studentlist.get(i).getMasv().equals(masvSearch))
                        {
                            studentlist.get(i).showInfo();
                            count++;
                        }
                    }
                    if(count==0) System.out.println("Khong tim thay sinh vien nao");
                    break;
                case 5:
                   Collections.sort(studentlist, new Comparator<Student>() {
                          @Override
                          public int compare(Student o1,Student o2)
                          {
                              int cmp=o1.getName().compareTo(o2.getName());
                              if(cmp>=0) 
                              {
                                  return 1;
                              }
                              else
                              {
                                  return -1;
                              }
                          }
                   }
                   );
                   for(int i=0;i<studentlist.size();i++)
                   {
                       studentlist.get(i).showInfo();
                   }
                    break;
                case 6:
                    Collections.sort(studentlist, new Comparator<Student>() {
                          @Override
                          public int compare(Student o1,Student o2)
                          {
                              return o1.getMark()>=o2.getMark()?-1:1;
                          }
                   }
                   );    
                    for(int i=0;i<studentlist.size();i++)
                    {
                        if(studentlist.get(i).checkHB())
                        {
                            studentlist.get(i).showInfo();
                        }
                    }
                    break;
                case 7:
                    System.out.println("GoodBye!");    
                    break;
                default:
                    System.err.println("Nhap sai ");
                    break;
            }
        }while(choose!=7);
    }
    static void showMenu()
    {
        System.out.println("1. Nhap vao N sinh vien");
        System.out.println("2. Hien thi thong tin sinh vien");
        System.out.println("3. Hien thi max va min theo diem trung binh");
        System.out.println("4. Tim kiem theo ma sinh vien");
        System.out.println("5. Sort theo a->z theo ten sinh vien va hien thi");
        System.out.println("6. Hien thi sinh vien duoc hoc bong va sap xep diem theo tren xuong");
        System.out.println("7. Thoat");
        
    }
}

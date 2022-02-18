/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btqlsinhvien;

import java.util.ArrayList;
// java.util.Collections;
//import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
 
    public static void main(String[] args) {
        ArrayList<Student> studentlist =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("Nhap vao lua chon");
            
            choose=Integer.parseInt(sc.nextLine());
            switch(choose)
            {
                case 1:
                    System.out.println("Nhap vao so sinh vien can them");
                    int n;
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++)
                    {
                        Student student =new Student();
                        student.inputInfo();
                        studentlist.add(student);
                    }
                    break;
                case 2:
                    for(int i=0;i<studentlist.size();i++)
                    {
                        studentlist.get(i).showInfo();
                    }
                    break;
                case 3:
                    double minin=studentlist.get(0).getAvg();
                    double maxin=studentlist.get(0).getAvg();
                    int minindex=0,maxindex=0;
                    for(int i=1;i<studentlist.size();i++)
                    {
                        if(studentlist.get(i).getAvg()>maxin)
                        {
                            maxin=studentlist.get(i).getAvg();
                            maxindex=i;
                        }
                        if(studentlist.get(i).getAvg()<minin)
                        {
                            minin=studentlist.get(i).getAvg();
                            minindex=i;
                        }
                    }
                    System.out.println("Sinh vien co diem cao nhat la");
                    studentlist.get(maxindex).showInfo();
                    System.out.println("Sinh vien co diem thap nhat la");
                    studentlist.get(minindex).showInfo();
                    break;
                case 4:
                    System.out.println("Nhap vao ma sinh vien can tim");
                    String tmpString=sc.nextLine();
                    int flag =0;
                    for(int i=0;i<studentlist.size();i++)
                    {
                        if(tmpString.equals(studentlist.get(i).getId()))
                        {
                            studentlist.get(i).showInfo();
                            flag ++;
                        }
                    }
                    if(flag==0) System.out.println("Khong co sinh vien nao trung voi ma sinh vien tren!!!");
                    break;
              /*  case 5:
                    Collections.sort(studentlist, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1,Student o2)
                        {
                            int cmp=o1.getName().compareTo(o2.getName());
                            if(cmp>=0)
                            {
                                return -1;
                            }
                            else return 1;
                        }
                    });
                    break;
*/
                case 6:
                    //
                    break;    
                case 7:
                    System.out.println("GoodBye!");
                    break;    
                default:
                    System.out.println("Nhap lai!!!");
                    break;
            }
            
        } while (choose!=7);
        
    }
    public static void showMenu()
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class btqlsv {
    public static void main(String[] args)
    {
        
        studentinfo student=new studentinfo();
        student.setName("Pham Cong Tuan");
        student.setAddress("Nghe An");
        student.setEmail("TUANPRO");
        student.setId("B19DCCN605");
        student.setPhone("986071627");
        student.display();
        subject s=new subject();
        s.setSub("Math");
        s.setMa(1);
        s.setSotin(2);
        s.setSobaiktra(3);
        s.setSotiet(4);
        s.setTe("Tu");
        int avg=0;
        for(int i=1;i<=s.getSobaiktra();i++)
        {
            s.setG1();
            avg+=s.getG1();
        }
        s.display();
        double fee=s.getSotin()*480000;
        System.out.println(fee);
        System.out.println("diem tb la: "+avg/3);
        if(avg>=4)
        {
            System.out.println("Pass");
        }
        else System.out.println("Fail");
    }
}

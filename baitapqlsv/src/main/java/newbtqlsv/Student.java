/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbtqlsv;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Student extends Person{
    String masv;
    double mark;
    String email;

    public Student() {
    }

    public String getMasv() {
        return masv;
    }

    public boolean setMasv(String masv) {
        if(masv!=null&&masv.length()==8)
        {
        this.masv = masv;
        return true;
        }
        else
        {
            System.err.println("Nhap lai ");
            return false;
        }
    }
    public double getMark() {
        return mark;
    }

    public boolean setMark(double mark) {
        if(mark>=0&&mark<=10)
        {
        this.mark = mark;
        return true;
        }
        else
        {
            System.err.println("Nhap lai diem ");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email!=null&&email.contains("@")&&!email.contains(" "))
        {
        this.email = email;
        return true;
        }
        else
        {
            System.err.println("Nhap lai ");
            return false;
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); 
        Scanner sc=new Scanner(System.in);
        //sc.nextLine();
        System.out.println("Nhap ma sv: ");
        while(true)
        {
            String setma=sc.nextLine();
            boolean check=setMasv(setma);
            if(check) break;
        }
        System.out.println("Nhap diem ");
        while(true)
        {
            
            double avg=Double.parseDouble(sc.nextLine());
            boolean check=setMark(avg);
            if(check) break;
        }
        System.out.println("Nhap email ");
        while(true)
        {
           
            String input=sc.nextLine();
            boolean check=setEmail(input);
            if(check) break;
        }
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("; Ma sv "+masv+"; mark "+mark+"; email "+email);
    }
    public boolean checkHB()
    {
        if(mark>=8) return true;
        else return false;
    }
}

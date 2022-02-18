/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btqlsinhvien;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Student extends Person{
    String id ;
    double avg ;
    String email ;

    public Student(String id, double avg, String email) {
        this.id = id;
        this.avg = avg;
        this.email = email;
    }

    public Student() {
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        while(true)
        {
            String tmp=sc.nextLine();
            if(setId(tmp))
            {
                break;
            }
        }
        System.out.println("Nhap diem tb");
        while(true)
        {
            double tm=Double.parseDouble(sc.nextLine());
            if(setAvg(tm))
            {
                break;  
            }
        }
        System.out.println("Nhap email");
        while(true)
        {
            String ema = sc.nextLine();
            if(setEmail(ema))
            {
                break;
            }
        }
    }
                    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Student{" + "id=" + id + ", avg=" + avg + ", email=" + email + '}');
    }

 
    
    public boolean checkHB()
    {
        if(avg>=8)
        {
            return true;
        }
        else return false;
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if(id!=null&&id.length()==8)
        {
            this.id=id;
            return true;
        }
        else
        {
            System.err.println("Nhap lai: ");
            return false;
        }
    }

    public double getAvg() {
        return avg;
    }

    public boolean setAvg(double avg) {
        if(avg>=0&&avg<=10)
        {
        this.avg = avg;
        return true;
        }
        else{
            System.out.println("Nhap lai");
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
        else{
            System.out.println("Nhap lai");
            return false;
        }
    }
    
}

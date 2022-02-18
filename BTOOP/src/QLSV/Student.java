/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;



import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class Student extends Person implements Comparable<Student>{
    String id;
    float gpa;
    String email;

    public Student() {
    }
    static Scanner sc=new Scanner(System.in);

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap id");
        while(true)
        {
            String id1=sc.nextLine();
            boolean check=setId(id1);
            if(check)
            {
                break;
            }
        }
        System.out.println("Nhap diem");
        while(true)
        {
            float gpa1=Float.parseFloat(sc.nextLine());
            boolean check=setGpa(gpa1);
            if(check)
            {
                break;
            }
        }
        System.out.println("Nhap email");
        while(true)
        {
            String emaill=sc.nextLine();
            boolean ok=setEmail(emaill);
            if(ok) break;
        }
    }

    @Override
    public void output() {
        //super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Person :"+getName()+" "+getDate()+" "+getGender()+" "+getAddress());
        System.out.println(toString());
    }
    
    public boolean setGpa(float gpa1) {
        
        if(gpa1>=0&&gpa1<=10)
        {
            this.gpa=gpa1;
            return true;
        }
        else
        {
            System.err.println("Nhap lai diem hop le");
            return false;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id1) {
        if(id1.length()==8 &&id1!=null)
        {
            this.id=id1;
            return true;
        }
        else
        {
            System.out.println("Nhap lai");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email1) {
        if(email1!=null&&email1.contains("@")&&!email1.contains(" ")){
            this.email=email1;
            return true;
        }
        else
        {
            System.out.println("Nhap lai email");
            return false;
        }
    }

    @Override
    public String toString() {
        return "  " + "id=" + id + ", gpa=" + gpa + ", email=" + email +'}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
    public boolean checkscholarship()
    {
        return this.gpa>=8;
    }
    public static final Comparator<Student> diem = (Student o1, Student o2) -> Float.compare(o1.gpa, o2.gpa);
}

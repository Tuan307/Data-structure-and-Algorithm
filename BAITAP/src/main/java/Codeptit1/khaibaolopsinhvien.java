/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class khaibaolopsinhvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String id=sc.nextLine();
        String name=sc.nextLine();
        String grade=sc.nextLine();
        String date=sc.nextLine();
        float gpa=sc.nextFloat();
        Student stu=new Student();
        stu.setId("B20DCCN001");
        stu.setName("Nguyen Van A");
        stu.setGrade(grade);
        stu.setDate(date);
        stu.setGpa(gpa);
        System.out.println(stu.getId() + " " +stu.getName() + " " + stu.getGrade() + " " + stu.getDate() + " " + stu.getGpa());
    }
    
}
class Student{
    private String id;
    private String name;
    private String grade;
    private String date;
    private float gpa;

    public Student() {
        this.id = "";
        this.name = "";
        this.grade = "";
        this.date = "";
        this.gpa = 0f;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDate() {
        String[] word=date.split("/");
        String s="";
        while(word[0].length()<2)
        {
            word[0]="0"+word[0];
        }
        while(word[1].length() < 2) {
            word[1] = '0' + word[1];
        }
        while(word[2].length() < 4) {
            word[2] = '0' + word[2];
        }
        s=word[0]+"/"+word[1]+"/"+word[2];
        return s;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGpa() {
        String s=String.format("%.2f",gpa);
        return s;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

        
}

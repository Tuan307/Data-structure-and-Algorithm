/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Person {
    String name;
    String gender;
    String date;
    String address;
    Scanner sc=new Scanner(System.in);

    public Person() {
    }

    public Person(String name, String gender, String date, String address) {
        
        this.name = name;
        
        this.gender = gender;
        
        this.date = date;
       
        this.address = address;
    }

    public void input()
    {
        System.out.println("Nhap ten");
        name=sc.nextLine();
        System.out.println("Nhap gioi tinh");
        gender=sc.nextLine();
        System.out.println("Nhap ngay sinh");
        date=sc.nextLine();
        System.out.println("Nhap dia chi");    
        address=sc.nextLine();
    }
    public void output()
    {
        System.out.println(toString());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", date=" + date + ", address=" + address + ", sc=" + sc + '}';
    }
    
}

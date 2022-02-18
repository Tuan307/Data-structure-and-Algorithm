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
public class Person {
    String name;
    String gender;
    String birth;
    String address;

    public Person() {
    }

    public Person(String name, String gender, String birth, String address) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }

    public void inputInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten");
        name=sc.nextLine();
        System.out.println("Nhap gioi tinh");
        gender=sc.nextLine();
        System.out.println("Nhap ngay sinh");
        birth =sc.nextLine();
        System.out.println("Nhap dia chi");
        address=sc.nextLine();
    }
    public void showInfo()
    {
        System.out.println("Person{" + "name=" + name + ", gender=" + gender + ", birth=" + birth + ", address=" + address + '}');
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}

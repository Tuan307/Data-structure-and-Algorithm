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
public class Person {
    String name;
    String gender;
    String age;
    String address;

    public Person() {
    }

    public Person(String name, String gender, String age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void inputInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap gioi tinh ");
        gender=sc.nextLine();
        System.out.println("Nhap ngay sinh ");
        age=sc.nextLine();
        System.out.println("Nhap dia chi ");
        address=sc.nextLine();
    }
    public void showInfo()
    {
         System.out.println("name: "+name+"; gioi tinh: "+gender+"; ngay sinh "+age+"; dia chi "+address);
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}

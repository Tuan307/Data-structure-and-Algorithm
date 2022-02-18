/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btoop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Author {
    static Scanner sc=new Scanner(System.in);
    private String name;
    private int age;
    private String nickname;
    private String dateofBirth;
    private String address;

    public Author() {
    }
public Author(String nickname) {
        this.nickname = nickname;
    }
    public Author(String name, int age, String nickname, String dateofBirth, String address) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.dateofBirth = dateofBirth;
        this.address = address;
    }
    public void input(ArrayList<Author> authorlist)
    {
        System.out.println("Nhap ten tac gia:");
        name=sc.nextLine();
        System.out.println("Nhap tuoi tac gia:");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap but danh tac gia:");
        while(true)
        {
            nickname=sc.nextLine();
            boolean isFind=false;
            for(int i=0;i<authorlist.size();i++)
            {
                if(authorlist.get(i).getNickname().equalsIgnoreCase(nickname))
                {
                    isFind=true;
                }
            }
            if(isFind==false)
            {
                break;
            }
            else{
                System.err.println("But danh da trung");
            }
        }
        System.out.println("Nhap ngay sinh tac gia:");
        dateofBirth=sc.nextLine();
        System.out.println("Nhap que quan tac gia:");
        address=sc.nextLine();
        
    }
    public void input()
    {
        System.out.println("Nhap ten tac gia:");
        name=sc.nextLine();
        System.out.println("Nhap tuoi tac gia:");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ngay sinh tac gia:");
        dateofBirth=sc.nextLine();
        System.out.println("Nhap que quan tac gia:");
        address=sc.nextLine();
        
    }
    public void display()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", age=" + age + ", nickname=" + nickname + ", dateofBirth=" + dateofBirth + ", address=" + address + '}';
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public String getAddress() {
        return address;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Author {
    private String name;
    private int age;
    private String nickname;
    private String birthday;
    private String address;

    public Author() {
    }

    public Author(String name, int age, String nickname, String birthday, String address) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.birthday = birthday;
        this.address = address;
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

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    public void inputInfo(ArrayList<Author> authorlist)
    {
        inputInfo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap but danh");
        while(true)
        {
            nickname=sc.nextLine();
            boolean check=false;
            for(int i=0;i<authorlist.size();i++)
            {
                if(authorlist.get(i).getNickname().equals(nickname))
                {
                    check=true;
                }
            }
            if(!check) break;
            else
            {
                System.out.println("Nhap but danh khac");
            }
        }
    }
    public void inputInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten tac gia");
        name=sc.nextLine();
        System.out.println("Nhap tuoi");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Ngay sinh ");
        birthday =sc.nextLine();
        System.out.println("Nhap dia chi");
        address=sc.nextLine();
    }
    public void showInfo()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", age=" + age + ", nickname=" + nickname + ", birthday=" + birthday + ", address=" + address + '}';
    }
    
}

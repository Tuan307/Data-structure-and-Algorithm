/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Book {
    String bookname;
    String datepublic;
    String nickname ;

    public Book() {
    }

    public Book(String bookname, String datepublic, String nickname) {
        this.bookname = bookname;
        this.datepublic = datepublic;
        this.nickname = nickname;
    }

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten sach ");
        bookname=sc.nextLine();
        System.out.println("Ngay xuat ban");
        datepublic=sc.nextLine();
        System.out.println("But danh ");
        nickname=sc.nextLine();
    }
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getDatepublic() {
        return datepublic;
    }

    public void setDatepublic(String datepublic) {
        this.datepublic = datepublic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void showInfo()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Book{" + "bookname=" + bookname + ", datepublic=" + datepublic + ", nickname=" + nickname + '}';
    }
    
}

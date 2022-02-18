/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btoop;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Book {
    private String bookname;
    private String daterelease;
    private String nickname;

    public Book() {
    }

    public Book(String bookname, String daterelease, String nickname) {
        this.bookname = bookname;
        this.daterelease = daterelease;
        this.nickname = nickname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getDaterelease() {
        return daterelease;
    }

    public void setDaterelease(String daterelease) {
        this.daterelease = daterelease;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten sach");
        bookname=sc.nextLine();
        System.out.println("Ngay xuat ban");
        daterelease=sc.nextLine();
        System.out.println("Nhap ten but danh");
        nickname=sc.nextLine(); 
    }
    public void display()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Book{" + "bookname=" + bookname + ", daterelease=" + daterelease + ", nickname=" + nickname + '}';
    }
    
}

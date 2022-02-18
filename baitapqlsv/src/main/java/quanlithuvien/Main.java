/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choose,n;
        ArrayList<Author> authorlist=new ArrayList<>(); // quan ly tac gia
        ArrayList<Book> booklist=new ArrayList<>(); // quan ly sach
        do{
            showMenu();
            choose=Integer.parseInt(sc.nextLine());
            switch(choose)
            {
                case 1:
                    
                    System.out.println("Nhap so sach can them");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++)
                    {
                        Book book=new Book();
                        book.input();
                        boolean check=false;
                        for(int j=0;j<authorlist.size();i++)
                        {
                            if(authorlist.get(j).getNickname().equals(book.getNickname()))
                            {
                                check=true;
                                break;
                            }
                        }
                        if(!check)
                        {
                            Author author =new Author(book.getNickname());
                            author.inputInfo();
                            authorlist.add(author);
                        }
                        booklist.add(book);
                    }
                    break;
                case 2:
                    for(int i=0;i<booklist.size();i++)
                    {
                        booklist.get(i).showInfo();
                    }
                    break;
                case 3:
                    System.out.println("Nhap so tac gia can them ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("Nhap thong tin tac gia ");
                        Author author=new Author();
                        author.inputInfo(authorlist);
                        authorlist.add(author);   
                    }
                    break;
                case 4:
                    System.out.println("Nhap ten but danh can tim ");
                    String nickname=sc.nextLine();
                    for(int i=0;i<booklist.size();i++)
                    {
                        if(booklist.get(i).getNickname().equals(nickname))
                        {
                            booklist.get(i).showInfo();
                        }
                    }
                    break;
                case 5:
                    System.out.println("GoodBye!");
                    break;    
                default:
                    System.out.println("Nhap sai! nhap lai");
                    break;
            }
        }while(choose!=5);
    }
    static void showMenu()
    {
        System.out.println("1. Nhap thong tin sach ");
        System.out.println("2. Hien thi tat ca sach ra man hinh ");
        System.out.println("3. Nhap thong tin tac gia ");
        System.out.println("4. Tim kiem tat ca cac sach viet boi tac gia ");
        System.out.println("5. Thoat");
    }
}

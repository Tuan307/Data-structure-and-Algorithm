/*
 Tong ket bai tap:
 Neu muon kiem tra co hay chua thi lam 1 vong for roi kiem tra trong arraylist voi phuong thuc equalsIgnoreCase.
 */
package btoop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BTOOP {

    /**
     * @param args the command line arguments
     */
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Author> author=new ArrayList<Author>();
    static ArrayList<Book> book=new ArrayList<>();
    static void menu()
    {
        System.out.println("1.Nhap thong tin sach");
        System.out.println("2.Hien thi tat ca sach ");
        System.out.println("3.Nhap thong tin tac gia");
        System.out.println("4.Tim kiem thong tin sach viet boi tac gia");
        System.out.println("5.Thoat");
        System.out.println("Nhap lua chon");
        int choose=Integer.parseInt(sc.nextLine());
        switch(choose)
        {
            case 1:
                nhapsach();
                break;
            case 2:
                hienthi();
                break;
            case 3:
                nhaptacgia();
                break;
            case 4:
                timkiem();
                break;
            case 5:
                System.out.println("GoodBye!");
                System.exit(0);
            default:
                System.out.println("Moi ban nhap lai");
                break;
        }
    }

    private static void nhapsach() {
        System.out.println("Nhap so sach ban muon nhap vao");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            Book b=new Book();
            b.input();
            boolean isFind=false;
            for (int j=0;j<author.size();j++)
            {
                if(author.get(j).getNickname().equalsIgnoreCase(b.getNickname()))
                {
                    isFind=true;
                    break;
                }
            }
            if(isFind==false)
            {
                Author a=new Author(b.getNickname());
                a.input();
                author.add(a);
            }
            book.add(b);
            
        }
    }

    private static void hienthi() {
        for(Book b:book)
        {
            b.display();
        }
    }

    private static void nhaptacgia() {
        System.out.println("Nhap so thong tin tac gia");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            Author a=new Author();
            a.input(author);
            author.add(a);
        }
    }

    private static void timkiem() {
        System.out.println("Nhap ten but danh can tim");
        String name=sc.nextLine();
        for(int i=0;i<book.size();i++)
        {
            if(book.get(i).getNickname().equalsIgnoreCase(name))
            {
                book.get(i).display();
                for(int j=0;j<author.size();j++)
            {
                if(author.get(j).getNickname().equalsIgnoreCase(book.get(j).getNickname()))
                {
                    author.get(j).display();
                }
            }
            }
        }
    }
    public static void main(String[] args) {
        while(true)
        {
            menu();
        }
    }
    
}
/*
*/

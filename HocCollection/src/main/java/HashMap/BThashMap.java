/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BThashMap {
    static HashMap<Integer,String> map=new HashMap<>();
    public static void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:Them");
        System.out.println("2:Xuat");
        System.out.println("3:Sua");
        System.out.println("4:Xoa");
        System.out.println("5:Tim Kiem");
        System.out.println("6:Thoat");
        System.out.println("Moi ban chon:");
        int choose=sc.nextInt();
        switch(choose)
        {
            case 1:
                System.out.println("Chon so cuon sach can them");
                int n=sc.nextInt();
                for(int i=0;i<n;i++)
                {
                    System.out.println("Sach can them la");
                    int key=sc.nextInt();
                    String book=sc.nextLine();
                    if(map.containsKey(key)==false) map.put(key, book);
                }
                break;
            case 2:
                System.out.println("Ten sach: ");
                for(Map.Entry<Integer,String> item:map.entrySet())
                {
                    System.out.println(item.getKey()+" "+item.getValue());
                }
                break;
            case 3:
                System.out.println("Moi ban nhap ma muon sua");
                int ma=new Scanner(System.in).nextInt();
                if(map.containsKey(ma)==false)
                {
                    System.out.println("Ma khong ton tai");
                }
                else
                {
                    System.out.println("Nhap ten sach moi");
                    String ten=new Scanner(System.in).nextLine();
                    map.put(ma, ten);
                }
                break;
            case 4:
                System.out.println("Nhap ma muon xoa");
                int key=new Scanner(System.in).nextInt();
                if(map.containsKey(key)==false)
                {
                    System.out.println("Khong co ma");
                }
                else{
                    map.remove(key);
                }
                break;
            case 5:
                System.out.println("Nhap ma can tim kiem");
                int matk=new Scanner(System.in).nextInt();
                if(map.containsKey(matk)==false)
                {
                    System.out.println("Khong tim thay ma");
                }
                else
                {
                    System.out.println(matk+" "+map.get(matk));
                }
                break;
            case 6:
                System.out.println("Cam on ban da dung!");
                System.exit(0);
                break;
            default:
                System.out.println("Nhap sai roi moi nhap lai!");
                break;
        }
    }
    public static void main(String[] args) {
        while(true)
        {
            menu();
        }
    }
}

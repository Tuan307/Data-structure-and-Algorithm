/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuuFileSerialize;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
//        ArrayList<Khachhang> list=new ArrayList<>();
//        list.add(new Khachhang("T", 1));
//        list.add(new Khachhang("A", 2));
//        list.add(new Khachhang("B", 3));
//        boolean res=SeriFileFactory.Luufile(list,"D:/danhsachkh.txt");
//        System.out.println(res==true ?"Luu file thanh cong":"Luu that bai");
          Object data=SeriFileFactory.Docfile("D:/danhsachkh.txt");
          ArrayList<Khachhang> ds= (ArrayList<Khachhang>)data;
          for(Khachhang ks:ds)
          {
              System.out.println(ks.getMa()+" "+ks.getTen());
          }
    }
}

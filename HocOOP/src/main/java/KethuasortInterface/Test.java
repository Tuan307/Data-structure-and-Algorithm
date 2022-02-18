/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KethuasortInterface;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Sanpham> list=new ArrayList<Sanpham>();
        list.add(new Sanpham(1,"coca",30));
        list.add(new Sanpham(2,"ca",60));
        list.add(new Sanpham(3,"pesi",40));
        Collections.sort(list);
         for(Sanpham sp:list)
        {
            System.out.println(sp);
        }
    }
}

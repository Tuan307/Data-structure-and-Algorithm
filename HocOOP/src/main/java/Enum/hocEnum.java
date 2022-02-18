/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Asus
 */
public class hocEnum {
    public static void main(String[] args) {
        ArrayList<Sinhvien> list=new ArrayList<>();
        list.add(new Sinhvien(1, "T", 9));
        list.add(new Sinhvien(2, "b", 3));
        list.add(new Sinhvien(3, "c", 6));
        Collections.sort(list);
        for(Sinhvien sv:list)
        {
            System.out.println(sv);
        }
    }
}

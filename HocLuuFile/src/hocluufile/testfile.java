/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocluufile;

import java.security.interfaces.DSAKey;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class testfile {
    public static void main(String[] args) {
        /*ArrayList<String> list= new ArrayList<>();
        list.add("OBAMA");
        list.add("Putin");
        list.add("Kim Young");
        list.add("XiaoLing");
        boolean result=HocLuuFile.luuFile(list,"D:/dulieutest.txt");
        if(result) System.out.println("Luu file thanh cong");
        else System.out.println("Luu file that bai");
        */
        ArrayList<String> doc=HocLuuFile.doc("D:/dulieutest.txt");
        for(String s:doc)
        {
            System.out.println(s);
        }
    }
}

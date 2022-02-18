/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTITclass;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class danhsachsinhvien1 {
    String masv;
    String name;
    String date;
    String lop;
    double GPA;

    public danhsachsinhvien1() {
    }
    public void display()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return " B20DCCN0" + masv + " " + name + " " +lop  + " " +  date+ " " + GPA ;
    }
    
}

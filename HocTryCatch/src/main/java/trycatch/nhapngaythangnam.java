/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class nhapngaythangnam {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        int yearNow=cal.get(Calendar.YEAR);
        System.out.println("Nhap nam sinh");
        Scanner sc=new Scanner(System.in);
        String ns=sc.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("dd//MM//yyyy");
        try {
            Date bir=sdf.parse(ns);
            cal.setTime(bir);
            int yearbir=cal.get(Calendar.YEAR);
            int tuoi=yearNow-yearbir;
            System.out.println(tuoi);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BT4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Calendar cal=Calendar.getInstance();
        int yearnow=cal.get(Calendar.YEAR);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date time=sdf.parse(s);
            cal.setTime(time);
            int birthyear=cal.get(Calendar.YEAR);
            System.out.println(yearnow-birthyear);
        } catch (ParseException e) {
            
        }
    }
}

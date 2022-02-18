/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class hoctrycatch {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        Date t=cal.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa");
        System.out.println(sdf.format(t));
        
        
}
}

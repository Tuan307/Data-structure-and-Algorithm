/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTITclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tuyendungcode {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<nv> list= new ArrayList<nv>();
    public static void main(String[] args) {
       
       int n=Integer.parseInt(sc.nextLine());
       for(int i=1;i<=n;i++)
       {
           nv tts=new nv();
           if(i<10)
           {
               String id="0"+String.valueOf(i);
               tts.setId(id);
           }
           else
           {
               String id=String.valueOf(i);
               tts.setId(id);
           }
           String name=sc.nextLine();
           tts.setName(name);
           float d1=Float.parseFloat(sc.nextLine());
           float d2=Float.parseFloat(sc.nextLine());
           if(d1<=10)
           {
               d1=d1*10;
           }
           if(d2<=10)
           {
               d2=d2*10;
           }
           float tb=(float)(d1+d2)/20;
           String tb1=String.format("%.2f",tb);
           tts.setTb(tb1);
           String xepLoai ;
            if(tb< 5){
                xepLoai = "TRUOT";
                tts.setStatus(xepLoai);
            }else if(tb > 5 && tb< 8){
                xepLoai = "CAN NHAC";
                tts.setStatus(xepLoai);
            }else if(tb >= 8 && tb <= 9.5){
                xepLoai = "DAT";
                tts.setStatus(xepLoai);
            }else {
                xepLoai = "XUAT SAC";
                tts.setStatus(xepLoai);
            }
            list.add(tts);
       }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}
class nv implements Comparable<nv>{
    String name;
    float d1;
    float d2;
    String id;
    String tb;
    String status;
    public nv() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD2() {
        return d2;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTb() {
        return tb;
    }

    public void setTb(String tb) {
        this.tb = tb;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public void display()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return   "TS"+id+" " + name +" "+ tb+" "+status;
    }

    @Override
    public int compareTo(nv o) {
        if(Float.parseFloat(this.tb)>Float.parseFloat(o.tb))
        {
            return -1;
        }
        else if(Float.parseFloat(this.tb)<Float.parseFloat(o.tb))
        {
            return 1;
        }
        return 0;
    }
    
}

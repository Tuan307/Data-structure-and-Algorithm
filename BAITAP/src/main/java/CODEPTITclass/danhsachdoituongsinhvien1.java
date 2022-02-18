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
public class danhsachdoituongsinhvien1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<sinhvien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++)
        {
            sinhvien sv=new sinhvien();
            if(i<10)
            {
                String id="00"+String.valueOf(i);
                sv.setId(id);
            }
            else
            {
                String id="0"+String.valueOf(i);
                sv.setId(id);
            }
            String name=sc.nextLine();
            name = name.trim();
            name = name.replaceAll("\\s+", " ");
            name=name.toLowerCase();
            String[] arr=name.split(" ");
            String name1="";
           
            for(int j=0;j<arr.length;j++)
            {
                String a=arr[j].substring(0,1);
                a=a.toUpperCase();
                arr[j]=a+arr[j].substring(1,arr[j].length());
                name1=name1+arr[j]+" ";
                
            }
            sv.setName(name1);
            String lop=sc.nextLine();
            sv.setLop(lop);
            String date=sc.nextLine();
            StringBuffer ns=new StringBuffer(date);
            if(date.charAt(1)=='/')
            {
                ns.insert(0,"0");
            }
            if(ns.charAt(4)=='/')
            {
                ns.insert(3,"0");
            }
            sv.setDate(String.valueOf(ns));
            float gpa=Float.parseFloat(sc.nextLine());
            String diem=String.format("%.2f",gpa);
            sv.setDiem(diem);
            list.add(sv);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}
class sinhvien implements Comparable<sinhvien>{
    String name;
    String id;
    String lop;
    String date;
    String diem;

    public sinhvien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "B20DCCN"+id+" "+name+lop+" "+date+" "+diem;
    }

    @Override
    public int compareTo(sinhvien o) {
        if(Float.parseFloat(this.diem)>Float.parseFloat(o.diem))
        {
            return -1;
        }
        else if(Float.parseFloat(this.diem)<Float.parseFloat(o.diem))
        {
            return 1;
        }
        return 0;
    }
    
}

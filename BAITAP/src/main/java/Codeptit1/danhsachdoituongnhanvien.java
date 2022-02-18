/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class danhsachdoituongnhanvien {
    static ArrayList<Nhanvien> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++)
        {
            String s=String.valueOf(i);
            while(s.length()<5)
            {
                s='0'+s;
            }
            String id=s;
            String name=sc.nextLine();
            String sex=sc.nextLine();
            String date=sc.nextLine();
            String address=sc.nextLine();
            String social=sc.nextLine();
            String contractdate=sc.nextLine();
            Nhanvien nv=new Nhanvien(id, name, sex, date, address, social, contractdate);
            list.add(nv);
        }
        Collections.sort(list);
        for(int i=0;i<t;i++)
        {
            list.get(i).printout();
        }
        
    }
}
class Nhanvien implements Comparable<Nhanvien>{
    private String id;
    private String name;
    private String sex;
    private String date;
    private String address;
    private String socialid;
    private String contract;

    public Nhanvien() {
    }

    public Nhanvien(String id, String name, String sex, String date, String address, String socialid, String contract) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
        this.socialid = socialid;
        this.contract = contract;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

     public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialid() {
        return socialid;
    }

    public void setSocialid(String socialid) {
        this.socialid = socialid;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }
    public void printout()
    {
        System.out.print(getId()+" ");
        System.out.print(getName()+" ");
        System.out.print(getSex()+" ");
        System.out.print(getDate()+" ");
        System.out.print(getAddress()+" ");
        System.out.print(getSocialid()+" ");
        System.out.println(getContract()+" ");
    }
    public int getMonth(){
        String s = this.getDate();
        int day = (s.charAt(0) - '0')*10 + s.charAt(1)-'0';
        return day;
    }
    public int getDay(){
        String s = this.getDate();
        int month = (s.charAt(3)-'0')*10 + s.charAt(4)-'0';
        return month;
    }
    public int getYear(){
        String s = this.getDate();
        int year = (s.charAt(6)-'0')*1000 + (s.charAt(7) - '0')*100 + (s.charAt(8)-'0')*10 + s.charAt(9)-'0';
        return year;
    }
    @Override
    public int compareTo(Nhanvien o) {
        if(this.getYear()>o.getYear())
        {
            return 1;
        }
        if(this.getYear()==o.getYear()&&this.getMonth()>o.getMonth())
        {
            return 1;
        }
        if(this.getYear()==o.getYear()&&this.getMonth()==o.getMonth()&&this.getDay()>o.getDay())
        {
            return 1;
        }
        if(this.getYear()==o.getYear()&&this.getMonth()==o.getMonth()&&this.getDay()==o.getDay())
        {
            return 0;
        }
        return -1;
}
}

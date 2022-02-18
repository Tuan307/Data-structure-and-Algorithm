/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTITclass.newpackage;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String gender=sc.nextLine();
        String date=sc.nextLine();
        String address=sc.nextLine();
        String tax=sc.nextLine();
        String contract=sc.nextLine();
        nhanvien nv=new nhanvien(name, gender, date, address, tax, contract);
        System.out.println(nv);
    }
}
class nhanvien{
    String name;
    String manv;
    String gender;
    String date;
    String address;
    String tax;
    String contractdate;

    public nhanvien(String name, String gender, String date, String address, String tax, String contractdate) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.tax = tax;
        this.contractdate = contractdate;
    }

    @Override
    public String toString() {
        return  "00001 "+ name + " " + gender +" " + date + " " + address + " " + tax + " " + contractdate ;
    }
    
}

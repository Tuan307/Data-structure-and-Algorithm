/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class studentinfo {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String id;
    Scanner sc=new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
     public void display()
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(id);
        System.out.println(email);
        System.out.println(phone);
        
    }
}

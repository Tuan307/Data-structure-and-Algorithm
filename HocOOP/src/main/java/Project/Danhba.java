/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Danhba implements Serializable,Comparable<Danhba>{
    private int id;
    private String name;
    private String phone;

    public Danhba() {
    }

    public Danhba(String name, String phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Danhba{" + "id=" + id + ", name=" + name + ", phone=" + phone + '}';
    }

    @Override
    public int compareTo(Danhba o) {
        return this.phone.compareTo(o.phone);
    }

    
    
    
}

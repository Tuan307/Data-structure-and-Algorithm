/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapOOP;

/**
 *
 * @author Asus
 */
public class Nhanvien {
    private String name;
    private int sosp;

    public Nhanvien(String name, int sosp) {
        this.name = name;
        this.sosp = sosp;
        if(sosp<0) this.sosp=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSosp() {
        return sosp;
    }

    public void setSosp(int sosp) {
        this.sosp = sosp;
    }
    public double getLuong()
    {
        double dongia=0;
        if(this.sosp<=199)
        {
            dongia=0.5;
        }
        else if(sosp<=399&&sosp>=200)
        {
            dongia=0.55;
        }
        else if(sosp<=599&&sosp>=400)
        {
            dongia=0.6;
        }
        else if(sosp>=600)
        {
            dongia=0.65;
        }
        return this.sosp*dongia;
    }
    public boolean lonhon(Nhanvien nv2)
    {
        return this.sosp>nv2.sosp;
    }
}

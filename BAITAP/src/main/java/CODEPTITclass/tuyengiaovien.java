/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTITclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tuyengiaovien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<giaovien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++)
        {
            giaovien gv=new giaovien();
            if(i<10)
            {
                String id="0"+String.valueOf(i);
                gv.setId(id);
            }
            else{
                 String id=String.valueOf(i);
                gv.setId(id);
            }
            String name=sc.nextLine();
            gv.setName(name);
            String mm=sc.nextLine();
            
            if(mm.charAt(0)=='A')
            {
                gv.setMamon("TOAN");
            }
            else if(mm.charAt(0)=='B')
            {
                gv.setMamon("LY");
            }
            else if(mm.charAt(0)=='C')
            {
                gv.setMamon("HOA");
            }
            if(mm.charAt(1)=='1')
            {
                gv.setDcong((float)2.0);
            }
            else if(mm.charAt(1)=='2')
            {
                gv.setDcong((float)1.5);
            }
            else if(mm.charAt(1)=='3')
            {
                gv.setDcong((float)1.0);
            }
            else if(mm.charAt(1)=='4')
            {
                gv.setDcong((float)0);
            }
            float dtin=Float.parseFloat(sc.nextLine());
            float dchuyen=Float.parseFloat(sc.nextLine());
            float diemtong=dtin*2+dchuyen+gv.getDcong();
            String diemtong1=String.valueOf(diemtong);
            gv.setDiemtong(diemtong1);
            if(diemtong>=18)
            {
                gv.setXeploai("TRUNG TUYEN");
            }
            else{
                gv.setXeploai("LOAI");
            }
            list.add(gv);
        }
        Collections.sort(list);
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}
class giaovien implements Comparable<giaovien>{
    String name;
    String id;
    String xeploai;
    float dtin;
    float dchuyen;
    String mamon;
    float dcong;
    String diemtong;
    public giaovien() {
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

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public float getDtin() {
        return dtin;
    }

    public void setDtin(float dtin) {
        this.dtin = dtin;
    }

    public float getDchuyen() {
        return dchuyen;
    }

    public void setDchuyen(float dchuyen) {
        this.dchuyen = dchuyen;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public float getDcong() {
        return dcong;
    }

    public void setDcong(float dcong) {
        this.dcong = dcong;
    }

    public String getDiemtong() {
        return diemtong;
    }

    public void setDiemtong(String diemtong) {
        this.diemtong = diemtong;
    }

    @Override
    public String toString() {
        return "GV"+id+" "+name+" "+mamon+" "+diemtong+" "+xeploai;
    }

    @Override
    public int compareTo(giaovien o) {
        if(Float.parseFloat(this.diemtong)>Float.parseFloat(o.diemtong))
        {
            return -1;
        }
        else if(Float.parseFloat(this.diemtong)<Float.parseFloat(o.diemtong))
        {
            return 1;
        }
        return 0;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTITclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class bangdiemhocsinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<student> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++)
        {
            student stu=new student();
            if(i<10)
            {
                String id="0"+String.valueOf(i);
                stu.setId(id);
            }
            else
            { 
                String id=String.valueOf(i);
                stu.setId(id);
            }
            String name=sc.nextLine();
            stu.setName(name);
            float sum=0;
            float[] a=new float[10];
            for(int j=0;j<10;j++)
            {
                a[j]=Float.parseFloat(sc.nextLine());
                if(j==0||j==1){
                    sum=sum+a[j]*2;
                }
                else{
                    sum+=a[j];
                }
            }
            float sum1=(float)sum/12;
            String avg=String.format("%.1f",sum1);
            stu.setAvg(avg);
            if(sum<5)
            {
                stu.setRank("YEU");
            }
            else if(sum>=5&&sum<=6.9)
            {
                stu.setRank("TB");
            }
            else if(sum>=7&&sum<=7.9)
            {
                stu.setRank("KHA");
            }
            else if(sum>=8&&sum<=8.9)
            {
                stu.setRank("GIOI");
            }
            else if(sum>=9)
            {
                stu.setRank("XUAT SAC");
            }
            list.add(stu);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}
class student implements Comparable<student>{
    String name;
    String id;
    String avg;
    String rank;

    public student() {
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

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "HS"+id+" "+name+" "+avg+" "+rank;
    }

    @Override
    public int compareTo(student o) {
        if(Float.parseFloat(this.avg)>Float.parseFloat(o.avg))
        {
            return -1;
        }
        else if(Float.parseFloat(this.avg)<Float.parseFloat(o.avg))
        {
            return 1;
        }
        return 0;
    }
    public static final Comparator<student> id1= (student o1, student o2) -> o1.id.compareTo(o2.id);
}
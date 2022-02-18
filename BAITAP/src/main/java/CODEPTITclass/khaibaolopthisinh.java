/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTITclass;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class khaibaolopthisinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String age=sc.nextLine();
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        float tongdiem=(m1+m2+m3);
        sv sv1=new sv(name, age, m1, m2, m3, tongdiem);
        System.out.println(sv1);
        
    }
}
class sv{
    String name;
    String age;
    float m1;
    float m2;
    float m3;
    float tongdiem;

    public sv(String name, String age, float m1, float m2, float m3, float tongdiem) {
        this.name = name;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.tongdiem = tongdiem;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + tongdiem;
    }
    
    
}

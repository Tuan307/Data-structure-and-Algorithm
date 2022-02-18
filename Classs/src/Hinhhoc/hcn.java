/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinhhoc;

import java.util.jar.Attributes;

/**
 *
 * @author Asus
 */
public class hcn extends hinhhoc{
    int a;
    int b;

    public hcn() {
    }

   

    public hcn(int a, int b, String name, int number) {
        super(name, number);
        this.a = a;
        this.b = b;
    }

    @Override
    public void nhap() {
       
    }

    @Override
    public void inkq() {
        System.out.println("HCN");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
       
}

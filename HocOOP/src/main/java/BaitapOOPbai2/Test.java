/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapOOPbai2;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        Main mem=new Main();
        Employee T=new Employee();
        T.setName("Teo");
        T.setAddress("Q1");
        T.setPhone("0123456789");
        T.setPayrate(35);
        T.setSocial("123");
        mem.addstaff(T);
        Employee a=new Employee();
        a.setName("A");
        a.setAddress("Q2");
        a.setPhone("0121233456789");
        a.setPayrate(355);
        a.setSocial("123555");
        mem.addstaff(a);
        Excute an=new Excute();
        
        an.setName("LLL");
        an.setAddress("Q1");
        an.setPhone("789");
        an.setPayrate(325);
        an.setSocial("3");
        mem.addstaff(an);
        mem.payday();
    }
}

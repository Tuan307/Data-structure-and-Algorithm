/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocthread;

/**
 *
 * @author Asus
 */
public class TestRunThread {
    public static void main(String[] args) {
        HocThread th1=new HocThread();
        th1.start();
        HocThread th2=new HocThread();
        th2.start();
        HocThread th3=new HocThread();
        th3.start();
    }
}

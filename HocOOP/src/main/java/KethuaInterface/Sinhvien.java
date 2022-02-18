/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KethuaInterface;

/**
 *
 * @author Asus
 */
public class Sinhvien implements Lamviec,Giaitri{

    @Override
    public void complex() {
        System.out.println("Easy");
    }

    @Override
    public void difficulty() {
        System.out.println("Normal");
    }
    @Override
    public void sing()
    {
        System.out.println("Funny");
    }
}

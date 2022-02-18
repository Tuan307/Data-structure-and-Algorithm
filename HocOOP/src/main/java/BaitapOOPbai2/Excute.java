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
public class Excute extends Employee{
    private double bonus;
    public void award(double bonus)
    {
        this.bonus=bonus;
        System.out.println("Lanh: "+bonus);
    }   
    @Override
    public double pay()
    {
        return super.pay()+bonus;
    }
}

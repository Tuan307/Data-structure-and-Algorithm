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
public class hourly extends Employee{
    private int hourworked;
    public void addhour(int morehour)
    {
        this.hourworked=morehour;
    }
    @Override
    public double pay()
    {
        return this.hourworked*50;
    }

    @Override
    public String toString() {
        return super.toString()+ "hourly{" + "hourworked=" + hourworked + '}';
    }
    
}

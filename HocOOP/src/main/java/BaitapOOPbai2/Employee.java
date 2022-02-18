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
public class Employee extends Staffmember{

    protected String social;
    protected double payrate;

    @Override
    public String toString() {
        return super.toString()+ "social=" + social + ", payrate=" + payrate +" ";
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }
    
    @Override
    public double pay() {
        return 500;
    }
    
}

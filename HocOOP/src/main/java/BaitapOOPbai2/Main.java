/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapOOPbai2;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Main {
   
    private ArrayList<Staffmember> list=new ArrayList<Staffmember>();

    public Main() {
        list=new ArrayList<Staffmember>();
    }
    
    public void addstaff(Staffmember member)
    {
        list.add(member);
    }

    public ArrayList<Staffmember> getList() {
        return list;
    }

    public void setList(ArrayList<Staffmember> list) {
        this.list = list;
    }
    public void payday()
    {
        for (Staffmember mem:list)
        {
            System.out.println(mem);
        }
    }
}

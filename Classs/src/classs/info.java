/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

/**
 *
 * @author Asus
 */
public class info {
    private String name;
    private String address;
    private String id;
    private String email;
    private String number;

    public info(String name, String address, String id, String email, String number) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.email = email;
        this.number = number;
    }
    public void school()
    {
        System.out.println("I am going to school");
    }
    public void homework(String subject)
    {
        System.out.println("i am doing my "+subject+" homework");
    }
    public void payfee(float amount)
    {
        System.out.println("pay fee with "+amount);
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(id);
        System.out.println(email);
        System.out.println(number);
        
    }
}

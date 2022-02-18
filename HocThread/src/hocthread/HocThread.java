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
public class HocThread extends Thread{

    @Override
    public void run() {
        super.run(); 
//To change body of generated methods, choose Tools | Templates.
    try {
       for(int i=0;i<10;i++)
        {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+" :i="+i);
        }     
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

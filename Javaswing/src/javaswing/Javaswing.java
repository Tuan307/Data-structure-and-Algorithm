/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class Javaswing extends JFrame{

    private JFrame frame;
    JButton button;
    public Javaswing()
    {
        createandshow();
    }
    public void createandshow()
    {
        button=new JButton("OK");
        //this.frame=new JFrame("Hello");
        this.setSize(400, 400);
        this.add(button);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Javaswing();
    }
    
}

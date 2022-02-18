/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Asus
 */
public enum Xeploai {
    Gioi ("Giỏi"),
    Kha ("Khá"),
    Trungbinh ("Trung Bình");
    private String msg; 
     Xeploai(String msg)
    {
        this.msg=msg;
    }
    public String getDescription()
    {
        return this.msg;
    }
}

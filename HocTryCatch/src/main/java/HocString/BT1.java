/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocString;

/**
 *
 * @author Asus
 */
public class BT1 {
    public static void main(String[] args) {
        String s="D/MUSIC/longme.mp3";
        int vtcuoi=s.indexOf("/");
        System.out.println(vtcuoi);
        int vt=s.lastIndexOf(".");
        System.out.println(vt);
        s=s.substring(vtcuoi+1,vt);
        System.out.println(s);
    }
}

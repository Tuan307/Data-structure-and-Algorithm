/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTFILE2;

import BTLUUFILE.Khachhang;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class FileFactory {
    public static boolean saveFile(ArrayList<Danhba> list,String path)
    {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     public static ArrayList<Danhba> doc(String path)
    {
        ArrayList<Danhba> list=new ArrayList<>();
        try {
           FileInputStream fis = new FileInputStream(path);
           ObjectInputStream ois=new ObjectInputStream(fis);
           Object data=ois.readObject();
           list=(ArrayList<Danhba>) data;
            fis.close();
            ois.close();
            }
         catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

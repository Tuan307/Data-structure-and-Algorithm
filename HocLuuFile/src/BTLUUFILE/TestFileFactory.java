/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTLUUFILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class TestFileFactory {
    public static boolean saveFile(ArrayList<Khachhang> ds,String path)
    {
        try {
            FileOutputStream fos =new FileOutputStream(path);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            for(Khachhang ks:ds)
            {
                String line=ks.getMa()+" "+ks.getTen()+" "+ks.getDate();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<Khachhang> doc(String path)
    {
        ArrayList<Khachhang> list=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            String line =br.readLine();
            while(line!=null)
            {
                String[] arr=line.split(" ");
                if(arr.length==3)
                {
                    Khachhang kh=new Khachhang();
                    kh.setMa(Integer.parseInt(arr[0]));
                    kh.setTen(arr[1]);
                    kh.setDate(arr[2]);
                    list.add(kh);
                }
                line=br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

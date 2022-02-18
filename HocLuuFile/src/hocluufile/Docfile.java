/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocluufile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Docfile {
    public static void ghifile(ArrayList<String> ds,String path)
    {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            for (String s:ds)
            {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void doc(ArrayList<String> list,String path)
    {
        try {
            FileInputStream fis=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            String line=br.readLine();
            while(line!=null)
            {
                if(line.length()>0)
                {
                    list.add(line);
                    line=br.readLine();
                }
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        ghifile(list1,"D:/luutrufile.txt");
        doc(list1,"D:/luutrufile.txt");
        int sum=0;
        for(String s:list1)
        {
            sum+=Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}

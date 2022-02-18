/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tinhtongfile {
     public static boolean write(ArrayList<String> list,String path)
    {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw=new BufferedWriter(osw);
            for(String data:list)
            {
                bw.write(data);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<String> doc(String path)
    {
        ArrayList<String> dsData=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
            BufferedReader br=new BufferedReader(isr);
            String line=br.readLine();
            while(line!=null)
            {
                if(line.length()>0)
                {
                    dsData.add(line);
                }
                line=br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsData;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        list.add("12 3 4 5 6 7\n" +
                "\n" +
                "Aaa 1 1 Bbb XXX yyy 5 5\n" +
                "\n" +
                "999999999999999999999999\n" +
                "\n" +
                "9");

        boolean ok=write(list, "D:\\Hello.txt");
        if(ok) System.out.println("YES");
        else   System.out.println("NO");
        ArrayList<String> list1=doc("D:\\Hello.txt");
        for(int i=0;i<list1.size();i++)
        {
            boolean ok1=true;
            String[] arr=list1.get(i).split(" ");
            for(String x:arr)
            {
                if(x.length()<=9)
                {
                    
                    if(x.contains("\\W"));
                }
            }
            
        }       
    }
}

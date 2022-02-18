/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocluufile;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class HocLuuFile {

    /**
     * @param args the command line arguments
     */
    public static boolean luuFile(ArrayList<String> ds,String path)
    {
        
        try {
            FileOutputStream fos=new FileOutputStream(path);
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw=new BufferedWriter(osw);
            for(String data:ds)
            {
                bw.write(data);
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
    public static ArrayList<String> doc(String path)
    {
        ArrayList<String> ds=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
            BufferedReader br=new BufferedReader(isr);
            String line=br.readLine();
            while (line!=null) {                
                if(line.length()>0)
                {
                    ds.add(line);
                }
                line=br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) throws IOException{
        String url="D:/dskh1.txt";
       
        try {
            FileInputStream fis=new FileInputStream(url);
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr); 
            String line=br.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

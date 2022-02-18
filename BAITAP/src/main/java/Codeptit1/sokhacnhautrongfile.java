/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class sokhacnhautrongfile {
     public static Map<String, Integer> HashMapFromTextFile()
    {
  
        Map<String, Integer> map
            = new HashMap<String, Integer>();
        BufferedReader br = null;
  
        try {
            File file = new File("DATA.in");
  
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
            String s1="";
            while ((line = br.readLine()) != null) {
                s1+=line+" "; 
            }
               String[] a=s1.split("\\s+");
            for(String n:a)
            {
                if(map.containsKey(n))
                {
                    map.put(n, map.get(n)+1);
                }
                else
                {
                    map.put(n, 1);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
 
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                };
            }
        }
  
        return map;
    }
    public static void main(String[] args) {
        Map<String, Integer> mapFromFile
            = HashMapFromTextFile();
        Map<String,Integer> tree=new TreeMap<>();
        tree.putAll(mapFromFile);
        for (Map.Entry<String, Integer> entry : tree.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key+" "+val);
            
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

/**
 *
 * @author Asus
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Non Sleeping
 */
public class sokhacnhautrongdaytrongfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "DATA.in";
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while((line = br.readLine()) != null){
                String[] a = line.split("\\s+");
                for(int i = 0; i < a.length; i++){
                    if(hm.containsKey(Integer.parseInt(a[i]))){
                        hm.put(Integer.parseInt(a[i]), hm.get(Integer.parseInt(a[i])) + 1);
                    }
                    else {
                        hm.put(Integer.parseInt(a[i]), 1);
                    }
                }
            }
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                System.out.println(key + " " + val);
            }
            br.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

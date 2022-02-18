/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Asus
 */

     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Non Sleeping
 */
public class giaocua2so {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        Set<Integer> setA= new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp=s.nextInt();
            
            setA.add(tmp);
        }
        for (int j = 0; j < m; j++) {
            
            int tmp=s.nextInt();
           
            setB.add(tmp);
        }
        temp.addAll(setA);
        temp2.addAll(setB);
        Collections.sort(temp);
        Collections.sort(temp2);
        for (int i = 0; i < temp.size(); i++) {
            for(int j=0; j<temp2.size(); j++){
                if(temp2.get(j).equals(temp.get(i)))
                    res.add(temp.get(i));             
            }
        }               
        for (Integer i : res)
            System.out.print(i + " ");
        System.out.println();
    }
}
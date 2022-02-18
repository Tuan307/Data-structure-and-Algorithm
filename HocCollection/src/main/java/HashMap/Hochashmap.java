/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Asus
 */
public class Hochashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map;
        map = new HashMap<>();
        map.put(1,"TUAN");
        map.put(2,"DEP");
        map.put(3,"Trai");
        // lay toan bo ten ra
        for(int  i=1;i<=map.size();i++)
        {
            System.out.println(map.get(i));
        }
        //or
        Collection<String> ds=map.values();
        for(String name:ds)
        {
            System.out.println(name);
        }
        Set<Integer> dskey=map.keySet();
        for(int key:dskey)
        {
            System.out.println(key);
        }
    }
}

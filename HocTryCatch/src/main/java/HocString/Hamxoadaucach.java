/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocString;

/**
 *
 * @author Asus
 */
public class Hamxoadaucach {
    public static void main(String[] args) {
        String s="   Hello World  ";
        //System.out.println(s.trim());
        //System.out.println(s);
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)==' ')
            {
                i++;
            }
            else break;
        }
        System.out.println(i);
        s=s.substring(i);
        System.out.println(s);
        int k=0;
        for(int l=s.length()-1;l>=0;l--)
        {
            if(s.charAt(l)==' ')
            {
                k++;
            }
            else break;
        }
         System.out.println(k);
        s=s.substring(0,s.length()-k);
        System.out.println(s);
        StringBuilder sb=new StringBuilder();
        String s1="Tuan",s2="Pro";
        sb.append(s1);
        sb.append(" ");
        sb.append(s2);
        sb.insert(sb.length()," vip");
        System.out.println(sb.toString());
    }
}

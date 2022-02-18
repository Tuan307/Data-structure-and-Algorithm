/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btptit;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class chuanhoachuoi2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while (t>=0)
//        {
//            String name=sc.nextLine();
//            name=name.toLowerCase();
//            name=name.replaceAll("\\s\\s+"," ");
//            String result="";
//            String[] arr=name.split(" ");
//            for(String a:arr)
//            {
//                if(!a.equals("")&& !a.equals(null)){
//                    result+=String.valueOf(a.charAt(0)).toUpperCase()+a.substring(1)+" ";
//                }
//            }
//            String[] arr1=result.split(" ");
//            for(int i=1;i<arr1.length;i++)
//            {
//                if(i!=arr1.length-1){
//                    System.out.print(arr1[i]+" ");
//                }
//                else System.out.print(arr1[i]);
//            }
//            System.out.println(", "+arr1[0].toUpperCase());
//            t--;
//        }
        StringBuilder a= new StringBuilder("Hello");
        StringBuilder b=new StringBuilder("Hello World");
        b=a;
        a.append("Wo");
        System.out.println(b);
    }
}

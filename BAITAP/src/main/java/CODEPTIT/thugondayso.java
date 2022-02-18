/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class thugondayso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<n;++i){
            Integer temp=sc.nextInt();
            arrayList.add(temp);
        }
        while(true){
            boolean check=true;
            for(int i=0;i<arrayList.size()-1;++i){
                if((arrayList.get(i)+arrayList.get(i+1))%2==0){
                    arrayList.remove(i+1);
                    arrayList.remove(i);
                    check=false;
                }
            }
            if(check==true){
                break;
            }
        }
        System.out.println(arrayList.size());
    }
}

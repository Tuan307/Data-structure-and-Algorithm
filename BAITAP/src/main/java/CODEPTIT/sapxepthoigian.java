/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class sapxepthoigian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<thoigian> list=new ArrayList<>();
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            list.add(new thoigian(a, b, c));
            t--;
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
    
}
class thoigian implements Comparable<thoigian>
{
    private int a;
    private int b;
    private int c;

    public thoigian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(thoigian o) {
        if(this.a>o.a)
        {
            return 1;
        }
        else if(this.a<o.a)
        {
            return -1;
        }
        else
        {
           if(this.b>o.b)
           {
               return 1;
           }
           else if(this.b<o.b)
           {
               return -1;
           }
           else
           {
               if(this.c<o.c)
               {
                   return -1;
               }
               else
               {
                   return 1;
               }
           }
        }
    }

    @Override
    public String toString() {
        return this.a+" "+this.b+" "+this.c;
    }

  
    
    
}

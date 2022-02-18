/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Asus
 */
public class Parameter {
    public static int sum(int ...arr)
    {
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int s=sum(1,2,3,4,5,6,7,8,9,10);
        int s1=sum();
        int s2=sum(9,10);
        System.out.println(s+" "+s1+" "+s2);
    }
}


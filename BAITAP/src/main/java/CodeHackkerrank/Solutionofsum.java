/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeHackkerrank;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Solutionofsum {
     public static void twoSum(int[] nums, int target) {
        //int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int target=sc.nextInt();
         int n=sc.nextInt();
         int[] nums=new int[n];
         for(int i=0;i<n;i++)
         {
             nums[i]=sc.nextInt();
         }
         twoSum(nums, target);
     }
}

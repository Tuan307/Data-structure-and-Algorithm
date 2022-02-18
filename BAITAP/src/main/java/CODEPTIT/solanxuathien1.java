/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class solanxuathien1 {
    	public static void main(String[] args) {
                        int dem1 = 1;
                        Scanner sc=new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			int a1[] = new int[100000];
			Arrays.fill(a1, 0);
			for(int i = 0; i < n ;i++) {
				a[i] = sc.nextInt();
			}
                        Arrays.sort(a);
                        for(int i = 0; i < n ;i++) {
			
				a1[a[i]]++;
			}
			int a2[] = new int[100000];
			Arrays.fill(a2, 0);
			dem1++;
			for(int i = 0; i < n;i++) {
				a2[a[i]]++;
				if(a2[a[i]] > 1) {
					continue;
				}
				else if(a2[a[i]] == 1) {
					System.out.println(a[i] + " xuat hien " + a1[a[i]] + " lan\n");
				}
			}
			
		}
    }


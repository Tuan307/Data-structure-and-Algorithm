/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeptit1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class demsolanxh {
    private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int dem1 = 1;
		int dem = sc.nextInt();
		while(dem > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int a1[] = new int[100000];
			Arrays.fill(a1, 0);
			for(int i = 0; i < n ;i++) {
				a[i] = sc.nextInt();
				a1[a[i]]++;
			}
			int a2[] = new int[100000];
			Arrays.fill(a2, 0);
			
			System.out.println("Test " +dem1 + ":\n" );
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
			dem--;
		}
	}
}
/*
idea bài này là: dùng mảng đánh dấu như thường để đếm số lần xuất hiện,rồi làm thêm 1 mảng nữa đếm lại số lần xuất hiện
với mục đính lấy số đấy lần đầu tiên để in ra, nếu gặp số đấy 1 lần nữa thì giá trị ptu đấy ở mảng 2 sẽ tăng lên 2 và
sẽ lớn hơn 1,khi đấy mình bỏ qua và chỉ in ra khi gặp số đấy lần đầu tưc là giá trị của ptu đấy ở mảng 2 là 1 và in 
ra giá trị xuất hiện ở mảng 1.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocString;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Asus
 */
// hoc ham tim chuoi

public class GthString {
    public static void main(String[] args) {
        String s1="Nguyen thi long lanh, chong chanh long lanh anh tuyet";
        // ham indexof: trả về chuỗi đầu tiên tìm thấy,nếu ko trả -1
        int i1=s1.indexOf("o");
        System.out.println(i1);
        //lastIndexOf: trả về vị trí cuối cùng
        int j1=s1.lastIndexOf("k");
        System.out.println(j1);
        // contains:kiểm tra xem có tồn tại chuỗi con không
        System.out.println(s1.contains("long lanh"));
        StringTokenizer st=new StringTokenizer(s1," ,");
        int dem;
        int k=0;
        ArrayList<String> arr=new ArrayList<>();
        while (st.hasMoreElements()) {
            String value=st.nextToken();
            arr.add(value);
        }
        for(int l=0;l<arr.size();l++)
        {
            dem=1;
            for(int j=l+1;j<arr.size();j++)
            {
            if(arr.get(l).equals(arr.get(j)))
            {
                dem++;
                arr.remove(j);
            }
            }
            System.out.println(arr.get(l)+" :"+dem);
        }
}
}

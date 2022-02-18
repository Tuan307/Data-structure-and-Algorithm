//TuyenDung/DoanhNghiep.java
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package TuyenDung;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
///**
// *
// * @author Non Sleeping
// */
//public class DoanhNghiep {
//    public static Scanner sc = new Scanner(System.in);
//    public static ArrayList<ThucTapSinh> thucTapSinh = new ArrayList<ThucTapSinh>();
//    public static void main(String[] args){
//        int t = Integer.parseInt(sc.nextLine());
//        for(int i = 1; i <= t; i++){
//            ThucTapSinh tts = new ThucTapSinh();
//            String name = sc.nextLine();
//            tts.setName(name);
//            Float liThuyet = Float.parseFloat(sc.nextLine());
//            tts.setLiThuyet(liThuyet);
//            Float thucHanh = Float.parseFloat(sc.nextLine());
//            tts.setThucHanh(thucHanh);
//            if(liThuyet <= 10){
//                liThuyet = liThuyet*10;
//            }
//            if(thucHanh <= 10){
//                thucHanh = thucHanh*10;
//            }
//            Float TB = (Float) (liThuyet + thucHanh) / 20;
//            String TB1 = String.format("%.2f", TB);
//            tts.setTB(TB1);
//            String xepLoai ;
//            if(TB < 5){
//                xepLoai = "TRUOT";
//                tts.setXepLoai(xepLoai);
//            }else if(TB > 5 && TB < 8){
//                xepLoai = "CAN NHAC";
//                tts.setXepLoai(xepLoai);
//            }else if(TB >= 8 && TB <= 9.5){
//                xepLoai = "DAT";
//                tts.setXepLoai(xepLoai);
//            }else {
//                xepLoai = "XUAT SAC";
//                tts.setXepLoai(xepLoai);
//            }
//            if(i < 10){
//                String ok = "0" + String.valueOf(i);
//                tts.setId(ok);
//            }else {
//                String ok = String.valueOf(i);
//                tts.setId(ok);
//            }
//            thucTapSinh.add(tts);
//        }
//        Collections.sort(thucTapSinh, new Comparator<ThucTapSinh>(){
//            public int compare(ThucTapSinh tts1, ThucTapSinh tts2){
//                if(Float.parseFloat(tts1.getTB()) > Float.parseFloat(tts2.getTB())){
//                    return -1;
//            }
//                return 1;}
//        });
//        for(ThucTapSinh tts_Obs : thucTapSinh){
//            System.out.println(tts_Obs.toString());
//        }
//    }
//}
//
//TuyenDung/ThucTapSinh.java
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package TuyenDung;
//
///**
// *
// * @author Non Sleeping
// */
//public class ThucTapSinh {
//    public String id;
//    public String name;
//    public Float liThuyet;
//    public Float thucHanh;
//    public String xepLoai;
//    public String TB;
//    public ThucTapSinh() {
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Float getLiThuyet() {
//        return liThuyet;
//    }
//
//    public void setLiThuyet(Float liThuyet) {
//        this.liThuyet = liThuyet;
//    }
//
//    public Float getThucHanh() {
//        return thucHanh;
//    }
//
//    public void setThucHanh(Float thucHanh) {
//        this.thucHanh = thucHanh;
//    }
//
//    public String getXepLoai() {
//        return xepLoai;
//    }
//
//    public void setXepLoai(String xepLoai) {
//        this.xepLoai = xepLoai;
//    }
//
//    public String getTB() {
//        return TB;
//    }
//
//    public void setTB(String TB) {
//        this.TB = TB;
//    }
//
//    @Override
//    public String toString() {
//        return  "TS" + id + " " + name + " " + TB + " " + xepLoai;
//    }
//    
//    
//}
//

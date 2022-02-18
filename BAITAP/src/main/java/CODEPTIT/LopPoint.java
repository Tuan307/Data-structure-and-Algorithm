/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTIT;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LopPoint {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            s.trim();
            String[] s1 = s.split("\\s+");
            Point p1 = new Point( Double.parseDouble(s1[0]),Double.parseDouble(s1[1]) );
            Point p2 = new Point( Double.parseDouble(s1[2]),Double.parseDouble(s1[3]) );
            System.out.println(p1.distance(p2));
        }
    }
}
class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
    public String distance(Point p1){
        double kc = Math.sqrt((Math.pow((Math.abs(this.x - p1.x)),2)) + (Math.pow(Math.abs(this.y - p1.y), 2)));
        kc = (double) Math.round(kc*10000)/10000;
        String kc1 = Double.toString(kc);
        while(kc1.length() < 6){
            kc1 = kc1 + "0";
        }
        return kc1;
    }
}

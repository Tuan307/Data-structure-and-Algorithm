/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEPTITclass;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Rectange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        String color=sc.nextLine();
        String first=color.substring(1,2);
        String remain=color.substring(2,color.length());
        first=first.toUpperCase();
        remain=remain.toLowerCase();
        String color1=first+remain;
        
        if(height<=0 ||width<=0)
        {
            System.out.println("INVALID");
        }
        else{
            Rectangle re=new Rectangle(width,height,color1);
            System.out.println(Math.round(re.findPerimeter())+" "+Math.round(re.findArea())+" "+re.getColor());
        }
    }
}
class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.height=1;
        this.width=1;
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
       
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return this.height*this.width;
    }
    public double findPerimeter()
    {
        return (this.height+this.width)*2;
    }
}

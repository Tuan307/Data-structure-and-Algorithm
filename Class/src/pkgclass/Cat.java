/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

public class Cat {
    private String name;
    private int age;
    private float weight;
    private String color;
    private String eyecolor;
    public void setname(String name)
    {
        this.name=name;
    }

    public Cat(String name) {
        this.name = name;
    }
    
    public Cat(String name, int age, float weight, String color, String eyecolor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.eyecolor = eyecolor;
    }

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }
    public String getname()
    {
        return name;
    }
    private void speak()
    {
        System.out.println(name+" is speaking");
    }
    public void move()
    {
        System.out.println(name+" is moving");
    }
    public void sleep()
    {
        System.out.println(name+" is sleeping");
    }
    public void eat()
    {
        System.out.println(name+" is eating");
    }
}

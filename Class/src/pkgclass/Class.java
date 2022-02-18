/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;


public class Class {

    
    public static void main(String[] args) {
        Cat tom=new Cat("tom",10,15.5f,"red","red");
        System.out.println("cat's name : "+tom.getname());
        System.out.println("cat's name : "+tom.getColor());
        System.out.println("cat's name : "+tom.getAge());
        tom.move();
        //
        Student mai=new Student();
        mai.name="Mai";
        mai.age=20;
        mai.avgmark=10;
        System.out.println("Name of student: "+mai.name);
        System.out.println("Age: "+mai.age);
        
    }
    
}

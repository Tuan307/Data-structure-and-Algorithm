/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;
import java.util.Scanner;

public class subject {
    Scanner sc=new Scanner(System.in);
    private String sub;
    private int ma;
    private int sotiet;
    private int sotin;
    private int sobaiktra;
    private String te;
    private int g1;
    public int getG1() {
        return g1;
    }

    public void setG1() {
        this.g1=sc.nextInt();
    }
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSotiet() {
        return sotiet;
    }

    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
    }

    public int getSotin() {
        return sotin;
    }

    public void setSotin(int sotin) {
        this.sotin = sotin;
    }

    public int getSobaiktra() {
        return sobaiktra;
    }

    public void setSobaiktra(int sobaiktra) {
        this.sobaiktra = sobaiktra;
    }

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

    public void display()
    {
        System.out.println("ten mon hoc "+ sub);
        System.out.println("ma mon hoc "+ma);
        System.out.println("so tin chi "+sotin);
        System.out.println("so tiet "+sotiet);
        System.out.println("so bai kiem tra "+sobaiktra);
        System.out.println("ten giao vien "+ te);
    }

       
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Kethua;

/**
 *
 * @author Asus
 */
public class Nhanvienchinhthuc extends Nhanvien{
    public Nhanvienchinhthuc()
    {
        super();
    }
    public Nhanvienchinhthuc(int ma,String ten)
    {
        super(ma, ten);
    }
    public void tinhluong()
    {
        super.tinhluong();
        System.out.println("Day la nhan vien chinh thuc");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.KethuaAbtract;

/**
 *
 * @author Asus
 */
public class Nhanvienchinthuc extends Nhanvienn{

    @Override
    public void tinhLuong() {
        System.out.println("Nhan vien chinh thuc goi tinh luong");
    }
    public Nhanvienchinthuc(int ma,String ten)
    {
        super(ma, ten);
    }
    public Nhanvienchinthuc()
    {
        super();
    }
}

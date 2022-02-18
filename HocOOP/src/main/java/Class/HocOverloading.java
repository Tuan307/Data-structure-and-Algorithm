/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Asus
 */
public class HocOverloading {
    private int ma;
    private String ten;
    private double diem;
    public HocOverloading()
    {
        
    }
     public HocOverloading(int ma)
     {
         this();
         this.ma=ma;
     }
     public HocOverloading(int ma,String ten)
     {
         this(ma);
         this.ten=ten;
     }
     public HocOverloading(int ma,String ten,double diem)
     {
          this(ma,ten);
          this.diem=diem;
     }
     public void xetTn()
     {
         if(this.diem>=5)
         {
             System.out.println("CHUC MUNG");
         }
         else System.out.println("Thu lai");
     }
     public void xetTn(double diem)
     {
         
     }
}

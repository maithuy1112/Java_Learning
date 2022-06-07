
package baitap.pkg4;

import java.util.Scanner;

public class NhaSanXuat {
    private int maNSX;
    private String tenNSX;
    private String diaChiNSX;
    
     public void nhapNSX(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ma NSX : ");
         maNSX = sc.nextInt();
         sc.nextLine();//xoa bo nho dem
         System.out.println("Ten NSX : ");
         tenNSX = sc.nextLine();
         System.out.println(" Dia chi NSX : ");
         diaChiNSX = sc.nextLine();
     }

        public String xuat(){
            return maNSX + tenNSX + diaChiNSX;
        }
 
    public NhaSanXuat() {
    }

    public NhaSanXuat(int maNSX, String tenNSX, String diaChiNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.diaChiNSX = diaChiNSX;
    }

    public int getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(int maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiaChiNSX() {
        return diaChiNSX;
    }

    public void setDiaChiNSX(String diaChiNSX) {
        this.diaChiNSX = diaChiNSX;
    }
    
    
}

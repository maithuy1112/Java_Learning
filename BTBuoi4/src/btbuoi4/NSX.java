
package btbuoi4;

import java.util.Scanner;

public class NSX {
    private int maNSX;
    private String tenNSX;
    private String diaChiNSX;
    
    public void nhapNSX(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma NSX : ");
        maNSX = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten NSX : ");
        tenNSX = sc.nextLine();
        System.out.println("Nhap dia chi NSX : ");
        diaChiNSX = sc.nextLine();
        
    }
    
    public String xuatNSX(){
        String tt = String.format("%10d%15s%20s", maNSX , tenNSX , diaChiNSX);
        return tt ;
    }
    public NSX() {
    }

    public NSX(int maNSX, String tenNSX, String diaChiNSX) {
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


package btbuoi4;

import java.util.Scanner;

public class Hang {
    private int maHang;
    private String tenHang;
    private NSX nSX;

    Hang(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void nhapHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang : ");
        maHang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten hang : ");
        tenHang = sc.nextLine();
        System.out.println("Nhap NSX ");
        nSX = new NSX();
        nSX.nhapNSX();
    }
    public void xuatHang(){
        String tt = String.format("%15d%20s%20s", maHang , tenHang , nSX.xuatNSX());
        System.out.println(tt);
        
    }
    public Hang() {
    }

    public Hang(int maHang, String tenHang, NSX nSX) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nSX = nSX;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getnSX() {
        return nSX;
    }

    public void setnSX(NSX nSX) {
        this.nSX = nSX;
    }
    
    
    
}


package baitap.pkg4;

public class Hang {
    private int maHang ;
    private String tenHang;
    private NhaSanXuat nhaSanXuat;
    public void xuatHang(){
        System.out.println(maHang);
        System.out.println(tenHang);
        System.out.println(nhaSanXuat.xuat());
    }

    public Hang() {
    }
    
    public Hang(int maHang, String tenHang, NhaSanXuat nhaSanXuat) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
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

    public NhaSanXuat getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    
    
    
    
}

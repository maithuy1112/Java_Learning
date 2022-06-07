
package baitapbuoi5;

public class SanPham {
    protected int maSanPham;
    protected String tenSanPham;
    protected String tenHangSanXuat;
    protected  int ngayNhap;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String tenHangSanXuat, int ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHangSanXuat = tenHangSanXuat;
        this.ngayNhap = ngayNhap;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    
    
}

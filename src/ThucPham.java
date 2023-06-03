
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pv
 */
public class ThucPham extends HangHoa{
    private Date nsx;
    private Date nhh;

    public ThucPham() {
    }

    public ThucPham(Date nsx, Date nhh) {
        this.nsx = nsx;
        this.nhh = nhh;
    }

    public ThucPham(Date nsx, Date nhh, String ma, String ten, int soLuong, double donGia, int tonKho) {
        super(ma, ten, soLuong, donGia, tonKho);
        this.nsx = nsx;
        this.nhh = nhh;
    }

    public Date getNsx() {
        return nsx;
    }

    public void setNsx(Date nsx) {
        this.nsx = nsx;
    }

    public Date getNhh() {
        return nhh;
    }

    public void setNhh(Date nhh) {
        this.nhh = nhh;
    }
    
    
}

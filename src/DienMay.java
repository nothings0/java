
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pv
 */
public class DienMay extends HangHoa{
    private Date baoHanh;

    public DienMay(Date baoHanh, String ma, String ten, int soLuong, double donGia, int tonKho) {
        super(ma, ten, soLuong, donGia, tonKho);
        this.baoHanh = baoHanh;
    }

    public DienMay() {
    }

    public DienMay(Date baoHanh) {
        this.baoHanh = baoHanh;
    }

    public Date getBaoHanh() {
        return baoHanh;
    }

    public void setBaoHanh(Date baoHanh) {
        this.baoHanh = baoHanh;
    }

}

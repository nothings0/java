
import java.util.Date;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pv
 */
public abstract class HangHoa {
    private String ma;
    private String ten;
    private int soLuong;
    private double donGia;
    private int tonKho;

    public HangHoa() {
    }

    public HangHoa(String ma, String ten, int soLuong, double donGia, int tonKho) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tonKho = tonKho;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getTonKho() {
        return tonKho;
    }

    public void setTonKho(int tonKho) {
        this.tonKho = tonKho;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "ma=" + ma + ", ten=" + ten + ", soLuong=" + soLuong + ", donGia=" + donGia + ", tonKho=" + tonKho + '}';
    }
    
    public String GenerateMaHang () {
        return "";
    }
    
    public abstract String GenerateTenHang ();
    
    Random random = new Random();
    
    public int GenerateSoLuong () {
        int randomNumber = random.nextInt(91) + 10;
        return randomNumber;
    }
    
    public int GenerateDonGia () {
        int randomNumber = random.nextInt(401) + 100;
        return randomNumber;
    }
    
    public int GenerateTonKho () {
        int randomNumber = random.nextInt(soLuong);
        return randomNumber;
    }
    
    public Date GenerateNSX (){
        
    }
}

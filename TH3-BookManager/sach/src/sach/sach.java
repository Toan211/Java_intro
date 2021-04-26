package sach;

import java.util.Scanner;

public class sach {
    private String maSach;
    private String tenSach;
    private double donGia; 
    private int soLuong;
    

    public sach()
    {
        this.maSach= "";
        this.tenSach = "";
        this.donGia=0.0;
        this.soLuong =0;        
    }

    // -------------get/set--------------
    //#region get/set
    public String getMaSach(){
        return maSach;
    }

    public void setMaSach(String maSach){
        this.maSach = maSach;
    }
    
    public String getTenSach(){
        return tenSach;
    }

    public void setTenSach(String tenSach){
        this.tenSach = tenSach;
    }

    public double getDonGia(){
        return donGia;
    }

    public void setDonGia(double donGia){
        this.donGia = donGia;
    }

    public int getSoLuong(){
        return soLuong;
    }

    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    //#endregion

    public void nhapSach()
    {
        //String tam;
        Scanner sc= new Scanner(System.in);
        System.out.print("Mã sách");
        this.maSach = sc.nextLine();
        System.out.print("Tên sách");
        this.tenSach = sc.nextLine();
        //tam=sc.nextLine();
        System.out.print("đơn giá:");
        this.donGia = sc.nextDouble();
        System.out.print("Số lượng:");
        this.soLuong = sc.nextInt();
        sc.close();
    }

    public double thanhTien()
    {
        return this.soLuong * this.donGia;     
    }


}

package sach;

import java.util.Scanner;

public class tieuThuyet extends sach {
    private int tinhTrang; //1 = mới, 0 = cũ

    public tieuThuyet()
    {
        super();
        this.tinhTrang = 0;
    }

    //#region get set
    public int getTinhTrang(){
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang){
        this.tinhTrang = tinhTrang;
    }
    //#endregion

    public void nhapTieuThuyet()
    {
        super.nhapSach();
        Scanner sc = new Scanner(System.in);
        System.out.print("Tình trạng:");
        this.tinhTrang = sc.nextInt();
        sc.close();
    }

    public double thanhTien()
    {
        if(this.tinhTrang == 0)
            return super.thanhTien()*0.2;
        else 
            return super.thanhTien();
    }
}

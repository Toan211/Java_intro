package sach;

import java.util.Scanner;

public class trinhTham extends sach {
    private int thue;

    public trinhTham()
    {
        super();
        this.thue = 0;
    }

    //#region get set
    public int getThue(){
        return thue;
    }

    public void setThue(int thue){
        this.thue = thue;
    }
    //#endregion

    public void nhapTrinhTham()
    {
        super.nhapSach();
        Scanner sc = new Scanner(System.in);
        System.out.print("Thue:");
        this.thue = sc.nextInt();
        sc.close();
    }

    public double thanhTien()
    {
        return super.thanhTien()+this.thue;
    }
}


package sach;

import java.util.ArrayList;
//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, this is book manager@!!!");

        //Scanner sc= new Scanner(System.in);

        ArrayList<sach> arrSach = new ArrayList<sach>();
        
        // System.out.print("nhap so sach can in:");
        // int sl = sc.nextInt();

        tieuThuyet s1 = new tieuThuyet();
        tieuThuyet s2 = new tieuThuyet();
        trinhTham tt1= new trinhTham();
        s1.nhapTieuThuyet();
        s2.nhapTieuThuyet();
        tt1.nhapTrinhTham();
        
        arrSach.add(s1);
        arrSach.add(tt1);
        arrSach.add(s2);
        double tong1=0,tong2=0;
        
        for(sach i:arrSach) {
           if(i instanceof tieuThuyet)
               tong1+=i.thanhTien();
           else
                tong2+=i.thanhTien();
        }
        System.out.println("Tổng tiền sách Tiểu thuyết ="+tong1);
        System.out.println("Tổng tiền sách Trinh thám ="+tong2);
        
        

        

    }
}

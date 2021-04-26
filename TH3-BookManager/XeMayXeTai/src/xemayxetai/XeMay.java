/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xemayxetai;

public class XeMay extends Xe{
    public XeMay(){
        super(); 
    }
    public void xeChay(double xang, double hang, double duong)
    {
        super.doXang(xang);
        super.chatHang(hang);
        super.chayQuangDuong(duong);
    }
    public double xangCon(){
        double duong,xang,hang;
        duong = super.getDuong();
        xang=super.getXang();
        hang=super.getHang();
        //1 km ton bao nhieu lit 
        double motkm = (double)2/100;
        double motkg = 0.1/10;
        double soXangChay = duong*motkm + hang*motkg; 
        return xang-soXangChay; 
    } 
}

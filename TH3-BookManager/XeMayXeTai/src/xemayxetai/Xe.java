package xemayxetai;
public class Xe {
    private double xang;
    private double hang;
    private double duong;
    public Xe(){
        xang=0;
        hang=0;
        duong=0; 
    }
    public void doXang(double n){
        xang+=n;
    }
    public void chayQuangDuong(double n)
    {
        duong=duong+n;
    }
    public void chatHang(double n)
    {
        hang+=n;
    }
    public void xuongHang(double n)
    {
        if(this.hang>=n)
            this.hang-=n;
        else
            this.hang=0; 
    }
    public double getHang(){
        return this.hang;
    }
    public double getXang(){
        return this.xang;
    }
    public double getDuong(){
        return this.duong;
    }
    
    
}

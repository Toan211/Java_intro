package phuongTien;

//import java.util.Scanner;

public class xe {
    private double km;
    private double lit;
    private double kg; 

    public xe()
    {
        
        this.km =0.0;
        this.lit =0.0;
        this.kg =0.0;        
    }

    // -------------get/set--------------
    //#region get/set
    public double getKm(){
        return km;
    }

    public void setKm(double km){
        this.km = km;
    }
    
    public double getLit(){
        return lit;
    }

    public void setLit(double lit){
        this.lit = lit;
    }

    public double getKg(){
        return kg;
    }

    public void setKg(double kg){
        this.kg = kg;
    }

    //#endregion
    
    

}

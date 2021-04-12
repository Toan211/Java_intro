
import java.util.Scanner;
// Your First Program

class HelloWorld {
    public static float AreaCircle(int r,float pi){
        return r*r*pi;
    }
    public static float PerimeterCircle(int r, float pi){
        return 2*r*pi;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        float pi = scan.nextFloat();
        System.out.println(AreaCircle(r, pi));
        System.out.println(PerimeterCircle(r, pi));
        scan.close();
    }
}
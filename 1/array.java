import java.util.Scanner;
import java.util.Arrays;

public class array {
    static Scanner scan = new Scanner(System.in);
    
    public static void NhapMang(int[] arr, int n){
        for(int i = 0; i < n; i ++){
            arr[i] = scan.nextInt();
        }
    }
    public static void XuatMang(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void Sum(int[] arr,int n){
        int a = 0;
        for(int i = 0; i < n; i ++){
            a = a + arr[i];
        }
        System.out.println(a);
    }
    public static boolean find(int[] arr, int x,int n){
        for(int i = 0; i < n;i++){
            if (x == arr[i])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        NhapMang(arr, n);
        XuatMang(arr);
        Sum(arr, n);
        int x = scan.nextInt();
        System.out.println(find(arr, x, n));   
        scan.close();
    }
    
}

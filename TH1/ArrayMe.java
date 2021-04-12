import java.util.Scanner;

import java.util.Arrays;

public class ArrayMe{
    static Scanner scan = new Scanner(System.in);


    public static void nhapMang(int[] arr, int n){
        System.out.println("Nhap mang can tim: ");
        for(int i = 0; i <n; i++){
            arr[i] = scan.nextInt();
        }
    }

    public static void xuatMang(int[] arr){
        System.out.println("Xuat mang: ");    
        System.out.println(Arrays.toString(arr));
    }
    
    public static void maxFind(int[] arr, int n){
        int max = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Xuat so lon nhat: " + max + "\n");  
    }

    public static void xCount(int[] arr, int n){
        System.out.print("Nhap x: ");
        int x = scan.nextInt();
        int count = 0;
        for(int i = 0; i <n; i++){
            if (arr[i] == x){
                count++;
            }
        }
        System.out.print("So phan tu co gia tri = " + x +" :" + count + "\n");
    }

    public static void findX(int[] arr, int n){
        boolean temp = false;
        System.out.print("Tim x: ");
        int x = scan.nextInt();
        for(int i = 0; i < n; i++){
            if (arr[i] == x){
                temp = true;
                break;
            }
        }
        if (temp == true){
            System.out.print("x co trong arr"+ "\n");
        } else if (temp == false){
            System.out.print("x ko co trong arr"+ "\n");
        }
        
    }

    public static void swap(int a, int b) 
    { 
        int temp = a; 
        a = b; 
        b = temp; 
    } 

    public static void sortDecr(int[] arr, int  n){
        int temp = arr[0];
        for(int i = 0; i<n-1; i++){
            for (int j = i+1; j < n; j++)
            {
                if (arr[i] < arr[j]){
                    temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                }
            }
        }

        for(int i = 0; i<n; i++){
            for (int j = i+1; j < n; j++)
            {
                if (arr[i] < arr[j]){
                    temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                }
            }
        }

        xuatMang(arr); 
    }

    public static void chockSortDecr(int[] arr, int  n){
        
        int[] newArr = new int[n + 1];
       
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        n = n +1;
        System.out.print("Nhap x: ");
        int x = scan.nextInt();
        int temp;
        
        
        for(int i = 0; i<n; i++){
            if (x > newArr[i])
            {
                for(int j = n-2; j>i; j--){
                    newArr[j + 1 ] = newArr[j]; 
                }
                temp = newArr[i]; 
                newArr[i] = x; 
                newArr[i+1] = temp; 
                break;
            }
            
        }
        xuatMang(newArr); 
    }

    public static void delX(int[] arr, int  n){
        
        
        System.out.print("Nhap x: ");
        int x = scan.nextInt();
        //count x
        int count = 0;
        for(int i = 0; i <n; i++){
            if (arr[i] == x){
                count++;
                
            }
        }
        int[] newArr = new int[n - count];

        for(int i = 0; i <n; i++){
            
        }

        xuatMang(newArr); 
    }

    public static void main(String[] args){
        
        System.out.print("Nhap so lg phan tu: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        nhapMang(arr, n);
        xuatMang(arr);
        maxFind(arr, n);
        xCount(arr, n);
        findX(arr, n);
        sortDecr(arr, n);
        chockSortDecr(arr, n);
        scan.close();
    }

}
import java.util.ArrayList;
//import java.util.ListIterator;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    
    
    public static void nhapMang(ArrayList<Integer> a, int num){
        a.add(num);
    }

    public static void nhapMangNhieu(ArrayList<Integer> a, int maxN){

        for (int i = 0; i < maxN; i++) {
            a.add(scan.nextInt());
        }
    }
    

    public static void xuatMang(ArrayList<Integer> a){
    //     ListIterator<Integer> iterator = a.listIterator();
    //     System.out.println("Các phần tử có trong list là: ");
    //     while (iterator.hasNext()) {
    //         System.out.println((Integer) iterator.next());
    //    }
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(a);
    }

    public static void  maxMang(ArrayList<Integer> a){
        // giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            // nếu kết quả của phép so sánh này lớn hơn 0
            // tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
            // thì gán max = phần tử tại vị trí i
            // và đó chính là phần tử lớn nhất
            if (a.get(i).compareTo(max) > 0) {
                max = a.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arrList = " + max);
    }

    public static void timX(ArrayList<Integer> a, int x){
        // kiểm tra arrListInteger có chứa phần tử có giá trị bằng 2 hay không
        boolean resultCheck = a.contains(x);
            
        // nếu resultCheck == true
        // thì hiển thị thông báo "Có phần tử 2 trong arrListInteger."
        // ngược lại hiển thị thông báo "Không tìm thấy phần tử 2."
        if (resultCheck == true) {
            System.out.println("Có phần tử x trong arrListInteger.");
            for (int i = 0; i < a.size(); i++) {
                if ( a.get(i)== x){
                    System.out.println("Phần tử x ở vị trí thứ "+ i);
                    break;
                }
            }
        } else {
            System.out.println("Không có phần tử x.");
        }
    }

    public static void ascArr(ArrayList<Integer> a){
        System.out.println("xắp xếp tăng dần");
        a.sort((o1, o2) -> o1 - o2);
    }

    public static void delX(ArrayList<Integer> a, int x){
        boolean isRemoved = a.remove(Integer.valueOf(x));
        if (isRemoved) {
            System.out.println("Xoa thanh cong");
        }
        System.out.print("Cac phan tu con lai: ");
        for (Integer i : a) {
            System.out.print(i + " ");
        }
    }

    public static void insX(ArrayList<Integer> a, int x){
        // index , số cần chèn
        ascArr(a);
        int l = a.size() - 1;
        System.out.print(l);
        if (x < a.get(l))
        {
            for (Integer i : a) {
                if (a.get(i) >= x){
                    a.add(i, x);
                    break;
                }
            }
        }else if (x >= a.get(l)){
            a.add(x);
        }
        
    }



    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.println("nhập số lượng cần add vào mảng: ");
        int num = scan.nextInt();
        nhapMangNhieu(list, num);
        xuatMang(list);
        maxMang(list);
        timX(list, 15);
        ascArr(list);
        xuatMang(list);
        delX(list, 15);
        xuatMang(list);
        insX(list, 15);
        xuatMang(list);
    }



}


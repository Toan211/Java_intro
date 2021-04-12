import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class IntAL {
    Scanner scanner = new Scanner(System.in);

    int num;
    ArrayList<Integer> list = new ArrayList<Integer>();

    public IntAL(int num){
        this.num = num;
    }

    

    public void nhapMang(ArrayList<Integer> a, int num){
        a.add(num);
    }

    public void xuatMang(ArrayList<Integer> a){
        ListIterator<Integer> iterator = list.listIterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.println((Integer) iterator.next());;
    }

    }
}


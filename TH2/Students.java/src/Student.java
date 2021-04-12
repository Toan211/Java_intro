import java.util.Scanner;

public class Student {
    
    Scanner scanner = new Scanner(System.in);

    public int mssv, aPoint;
    public String name;

    public Student(){
        System.out.println("Đây là hàm constructor, xin hãy nhập đối số:: \n");
    }

    public Student(int mssv, int aPoint, String name){
        this.mssv = mssv;
        this.name = name;
        this.aPoint = aPoint;
    }

    

    public void nhapSv() {
        System.out.println("Hãy nhập vào mssv cần nhập: ");
        mssv = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hãy nhập vào tên: ");
        name = scanner.nextLine();
        System.out.println("Hãy nhập vào điểm: ");
        aPoint = scanner.nextInt();
    }

    public void xuatSv() {
        System.out.println("MSSV: " + mssv + "||||| " + "Tên: " + name + "||||| " + "Điểm TB: " + aPoint + "\n");
		
    }

    // -------------get/set--------------
    //#region get/set
    public int getMssv(){
        return mssv;
    }

    public void setMssv(int mssv){
        this.mssv = mssv;
    }
    public int getAPoint(){
        return aPoint;
    }

    public void setAPoint(int aPoint){
        this.aPoint = aPoint;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //#endregion
    

    //bt thêm: dùng lớp arraylist quản lý danh sách các sinh viên trong lớp học
}

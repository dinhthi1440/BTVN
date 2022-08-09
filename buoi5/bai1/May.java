
import java.util.Scanner;

public class May {
    static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public int getMaMay() {
        return maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public void intput(){
        System.out.println("Nhap vao ma may: ");
        maMay = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao kieu may: ");
        kieuMay = sc.nextLine();
        System.out.println("Nhap vao tinh trang may: ");
        tinhTrang = sc.nextLine();
    }
    public void output(){
        System.out.println("Ma may: "+ maMay);
        System.out.println("Kieu may: "+ kieuMay);
        System.out.println("Tinh trang may: "+ tinhTrang);
    }
//    public static void main(String[] args) {
//        May may = new May();
//        may.intput();
//        may.output();
//    }
}

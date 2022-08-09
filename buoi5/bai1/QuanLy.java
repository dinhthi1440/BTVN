
import java.util.Scanner;

public class QuanLy {
    private int maQL;
    private String hoTen;
    static Scanner sc = new Scanner(System.in);

    public int getMaQL() {
        return maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setMaQL(int maQL) {
        this.maQL = maQL;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void input(){
        System.out.println("Nhap vao ma quan ly: ");
        maQL = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ho ten: ");
        hoTen = sc.nextLine();
    }
    public void output(){
        System.out.println("Ma quan ly: "+ maQL);
        System.out.println("Ho ten: "+ hoTen);
    }
//    public static void main(String[] args) {
//        QuanLy quanLy1 = new QuanLy();
//        quanLy1.input();
//        quanLy1.output();
//    }
    
    
}

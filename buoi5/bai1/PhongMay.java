
import java.util.Scanner;

public class PhongMay {
    static Scanner sc = new Scanner(System.in);
    private int maPhong;
    private String tenPhong;
    private int dienTich;
    private QuanLy quanLyX = new QuanLy();
    private May mayY = new May();

    public int getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public int getDienTich() {
        return dienTich;
    }

    public QuanLy getQuanLyX() {
        return quanLyX;
    }

    public May getMayY() {
        return mayY;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public void setQuanLyX(QuanLy quanLyX) {
        this.quanLyX = quanLyX;
    }

    public void setMayY(May mayY) {
        this.mayY = mayY;
    }
    
    public void input(){
        System.out.println("Nhap vao ma phong: ");
        maPhong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten phong: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhap vao dien tich phong (met vuong): ");
        dienTich = sc.nextInt();
        quanLyX.input();
        mayY.intput();
    }
    public void output(){
        System.out.println("Ma phong : "+ maPhong);
        System.out.println("Ten phong: "+ tenPhong);
        System.out.println("Dien tich phong: "+ dienTich);
        quanLyX.output();
        mayY.output();
    }
    public static void main(String[] args) {
        PhongMay phongMay = new PhongMay();
        System.out.println("\tNhap thong tin ");
        phongMay.input();
        System.out.println("\tThong tin sau khi nhap ");
        phongMay.output();
    }
    
    
    
}


import java.util.Scanner;

public class PhuongTien {
    static Scanner sc = new Scanner(System.in);
    protected String tenChuxe;
    protected int loaiXe;
    protected int dungTich;
    protected float triGia;
    protected float thue;
    
    public float getThue(){
        return thue;
    }

    public String getTenChuxe() {
        return tenChuxe;
    }

    public int getLoaiXe() {
        return loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTenChuxe(String tenChuxe) {
        this.tenChuxe = tenChuxe;
    }

    public void setLoaiXe(int loaiXe) {
        this.loaiXe = loaiXe;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }
    public void setThue(float thue){
        this.thue = thue;
    }
    
    public void input(){
        System.out.println("Nhap vao ten chu xe: ");
        tenChuxe = sc.nextLine();
        System.out.println("Nhap vao loai xe: ");
        loaiXe = sc.nextInt();
        System.out.println("Nhap vao dung tich xe: ");
        dungTich = sc.nextInt();
        System.out.println("Nhap vao tri gia xe: ");
        triGia = sc.nextFloat();
        sc.nextLine();
    }
    public void output(){
        System.out.printf("%20s%20d%20d%20.2f%20.2f\n",tenChuxe, loaiXe, dungTich, triGia, thue);
    }
    public static void main(String[] args) {
        PhuongTien pt = new PhuongTien();
        pt.input();
        System.out.printf("%20s%20s%20s%20s%20s\n","Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue");
        pt.output();
    }
    
    
}

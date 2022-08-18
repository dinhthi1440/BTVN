
import java.util.Scanner;

public class NhanVien extends CanBo{
    static Scanner sc = new Scanner(System.in);
    private String congViec;

    public NhanVien(String congViec, int id, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(id, hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NhanVien() {
    }
    

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public void inputNhanvien(){
        input();
        System.out.println("Nhap cong viec cua can bo: ");
        congViec = sc.nextLine();   
    }
    public void outputNhanvien(){
        output();
        System.out.printf("%-20s\n", congViec);
    }
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.inputNhanvien();
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
        nhanVien1.outputNhanvien();
    }
    
}

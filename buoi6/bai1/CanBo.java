
import java.util.ArrayList;
import java.util.Scanner;


public class CanBo {
    static Scanner sc = new Scanner(System.in);
    protected int id;
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo(int id, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    CanBo(){
        
    }
    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void input(){
        System.out.println("Nhap vao id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }
    
    public void output(){
        System.out.printf("%-10d%-20s%-20d%-20s%-20s", id, hoTen, namSinh, gioiTinh, diaChi);
    }
    public static void main(String[] args){
        CanBo canBo1= new CanBo();
        canBo1.input();
        System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi");
        canBo1.output();
    }
}


import java.util.Scanner;

public class CongNhan extends CanBo{
    static Scanner sc = new Scanner(System.in);
    private String bac;

    public CongNhan(String bac, int id, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(id, hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public CongNhan() {
    }
    

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }
    public void inputCongnhan(){
        input();
        System.out.println("Nhap bac cua can bo: ");
        bac = sc.nextLine();   
    }
    public void outputCongnhan(){
        output();
        System.out.printf("%-20s\n", bac);
    }
    public static void main(String[] args) {
        CongNhan congNhan1 = new CongNhan();
        congNhan1.inputCongnhan();
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Bac");
        congNhan1.outputCongnhan();
    }
    
    
}

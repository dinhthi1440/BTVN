
import java.util.Scanner;

public class KySu extends CanBo{
    static Scanner sc = new Scanner(System.in);
    private String nganhDt;

    public KySu(String nganhDt, int id, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(id, hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDt = nganhDt;
    }

    public KySu() {
    }
    

    public String getBac() {
        return nganhDt;
    }

    public void setNganhDt(String nganhDt) {
        this.nganhDt = nganhDt;
    }
    public void inputKysu(){
        input();
        System.out.println("Nhap nganh dao: ");
        nganhDt = sc.nextLine();   
    }
    public void outputKysu(){
        output();
        System.out.printf("-%s20\n", nganhDt);
    }
    public static void main(String[] args) {
        KySu kySu1 = new KySu();
        kySu1.inputKysu();
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh dao tao");
        kySu1.outputKysu();
    }
    
    
    
}

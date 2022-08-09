
import java.util.Scanner;

public class Address {
    static Scanner sc = new Scanner(System.in);
    private int id;
    private String district;
    private String province;

    public int getId() {
        return id;
    }

    public String getDistrict() {
        return district;
    }

    public String getProvince() {
        return province;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public void input(){
        System.out.println("Nhap vao id sinh vien: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao district cua sinh vien: ");
        district = sc.nextLine();
        System.out.println("Nhap vao province cua sinh vien: ");
        province = sc.nextLine();
    }
    public void output(){
        System.out.println("Id: "+ id);
        System.out.println("District: "+ district);
        System.out.println("Province: "+ province);
    }
}

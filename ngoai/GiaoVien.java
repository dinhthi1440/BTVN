
import java.util.Scanner;

public class GiaoVien {
    static Scanner sc = new Scanner(System.in);
    protected String maGv;
    protected String tenGv;
    protected String dateGv;
    protected String diaChigv;
    protected String khoaGv;
    protected int luong;
    protected String lopGv;

    public String getMaGv() {
        return maGv;
    }

    public String getTenGv() {
        return tenGv;
    }

    public String getDateGv() {
        return dateGv;
    }

    public String getDiaChigv() {
        return diaChigv;
    }

    public String getKhoaGv() {
        return khoaGv;
    }

    public int getLuong() {
        return luong;
    }

    public String getLopGv() {
        return lopGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }

    public void setDateGv(String dateGv) {
        this.dateGv = dateGv;
    }

    public void setDiaChigv(String diaChigv) {
        this.diaChigv = diaChigv;
    }

    public void setKhoaGv(String khoaGv) {
        this.khoaGv = khoaGv;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setLopGv(String lopGv) {
        this.lopGv = lopGv;
    }
    
    public void inputGv(){
//        System.out.println("Nhap ten");
        tenGv = sc.nextLine();
        tenGv = tenGv.trim().toLowerCase();
        tenGv = tenGv.replaceAll("\\s+", " ");
        String[] temp1=tenGv.split(" ");
        tenGv = "";
        for(int i=0; i<temp1.length; i++){
            tenGv+=String.valueOf(temp1[i].charAt(0)).toUpperCase() + temp1[i].substring(1);
            if(i<temp1.length-1){
                tenGv+=" ";
            }
        }
//        System.out.println("Nhap ngay sinh");
        dateGv = sc.nextLine();
//        System.out.println("Nhap dia chi");
        diaChigv = sc.nextLine();
//        System.out.println("Nhap khoa");
        khoaGv = sc.nextLine();
//        System.out.println("Nhap luong");
        luong = sc.nextInt();
        sc.nextLine();
//        System.out.println("Nhap lop");
        lopGv = sc.nextLine();
        
    }
    public void outputGv(){
        System.out.printf("%s %s %s %s %s %d %s\n", maGv, tenGv, dateGv, diaChigv, khoaGv, luong, lopGv);
    }
}

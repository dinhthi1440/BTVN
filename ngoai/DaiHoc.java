
import java.util.ArrayList;
import java.util.Scanner;

public class DaiHoc {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so luong");
        int n = sc.nextInt();
        sc.nextLine();
        
        
        ArrayList<SinhVienn> listSv = new ArrayList<>();
        ArrayList<GiaoVien> listGv = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
//            System.out.println("Nhap ma");
            String ma = sc.nextLine();
            if("GV".equals(ma.substring(0, 2))){
                GiaoVien gv = new GiaoVien();
//                System.out.println("Nhap thong tin gv");
                gv.setMaGv(ma);
                gv.inputGv();
                listGv.add(gv);
            } else if("SV".equals(ma.substring(0, 2))){
                SinhVienn sv = new SinhVienn();
//                System.out.println("Nhap thong tin sv");
                sv.setMsv(ma);
                sv.inputSv();
                listSv.add(sv);
            }
        }
        String truyVan = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP "+ truyVan.toUpperCase());
        for(int i=0; i<listGv.size(); i++){
            if(truyVan.equals(listGv.get(i).getLopGv())){
                listGv.get(i).outputGv();
            }
        }
        System.out.println("DANH SACH SINH VIEN LOP "+ truyVan.toUpperCase());
        for(int i=0; i<listSv.size(); i++){
            if(truyVan.equals(listSv.get(i).getLop())){
                listSv.get(i).outputSv();
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    private List<VatPham> arr=new ArrayList<>();
    public void nhap(){
        Scanner sc=new Scanner(System.in);

       while(true) {
           System.out.print("mời bạn nhập số lượng vật phẩm:");
           int n=sc.nextInt();
           if (n < 5){
               System.out.println("vật phẩm phải đủ 5");
               continue;
           }
           else{for (int i = 0; i < n; i++) {
               System.out.println("Nhập Thông Tin Vật Phẳm Thứ:" + (i + 1));
               System.out.println("1:Chiếc Búa Thần");
               System.out.println("2:Bao Tay Sấm Sét");
               System.out.println("3:Hòn Đá Kích Nổ");
               System.out.println("4:Cây Rìu Phép Thuật");
               System.out.println("5:Cây Gậy Chiến Thần");
               System.out.print("Mời bạn lựa chọn loại vật phẩm:");
               int flag = sc.nextInt();
               if (flag == 1) {
                   VatPham a = new ChiecBuaThan();
                   a.nhap();
                   arr.add(a);
               } else if (flag == 2) {
                   VatPham a = new BaoTaySamSet();
                   a.nhap();
                   arr.add(a);
               } else if (flag == 3) {
                   VatPham a = new HonDaKichNo();
                   a.nhap();
                   arr.add(a);
               } else if (flag == 4) {
                   VatPham a = new CayRiuPhepThuat();
                   a.nhap();
                   arr.add(a);
               } else if (flag == 5) {
                   VatPham a = new CayGayChienThan();
                   a.nhap();
                   arr.add(a);
               }
           }
            break;
           }


       }
    }
    public void xuat(){
        for(VatPham vt:arr){
            vt.xuat();
        }
    }

//    CÂU 3
    public float Max_Vang(){
        float max=0;
        for(VatPham vt:arr){
           if(vt.SoVangTrenSucCongPha()>max)
               max=vt.SoVangTrenSucCongPha();

        }
        return max;
    }
    public void cau3(){
        System.out.println("=======================CÂU 3 ==================");
        System.out.println("vật phẩm tốn nhiều xu vàng nhất:");
        for(VatPham vt:arr){
            if(vt.SoVangTrenSucCongPha()==Max_Vang()){
                vt.xuat();
            }
        }

    }
//END CÂU 3

//    CÂU 4

    public float TongSoVangCacVatPham(){
        float tong=0;
        for(VatPham vt:arr){
            tong+=vt.SoVangTrenSucCongPha();
        }
        return tong;
    }
    public void cau4(){
        System.out.println("=============CAU4============");
        System.out.println("tổng số vàng cần phải thu thập:"+TongSoVangCacVatPham());
        System.out.print("mời bạn nhập vào số vàng mà Spon thu được:");
        Scanner sc=new Scanner(System.in);
        int vangSpon=sc.nextInt();
        if(vangSpon<TongSoVangCacVatPham())
            System.out.println("Spon không giải cứu được đồng đội");
        else
            System.out.println("Spon giải cứu được đồn đội");

    }



}

public class VatPham {
    private int chiSoSucManh;
    private float heSoSucManh;
    private int soVangQuyDoi;
    private int loaiVatPham;
    public static final int _ChiecBuaThan=1;
    public static final int _BaoTaySamSet=2;
    public static final int _HonDaKichNo=3;
    public static final int _CayRiuPhepThuat=4;
    public static final int _CayGayChienThan=5;



    public VatPham() {
    }

    public VatPham(int chiSoSucManh, float heSoSucManh, int soVangQuyDoi, int loaiVatPham) {
        this.chiSoSucManh = chiSoSucManh;
        this.heSoSucManh = heSoSucManh;
        this.soVangQuyDoi = soVangQuyDoi;
        this.loaiVatPham = loaiVatPham;
    }

    public int getLoaiVatPham() {
        return loaiVatPham;
    }

    public void setLoaiVatPham(int loaiVatPham) {
        this.loaiVatPham = loaiVatPham;
    }

    public int getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(int chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public float getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(float heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public int getSoVangQuyDoi() {
        return soVangQuyDoi;
    }

    public void setSoVangQuyDoi(int soVangQuyDoi) {
        this.soVangQuyDoi = soVangQuyDoi;
    }
    public  void nhap(){

    }
    public void xuat(){
        System.out.println("############");
        if(this.loaiVatPham==_ChiecBuaThan)
            System.out.println("Chiếc Búa Thần");
        else if(this.loaiVatPham==_BaoTaySamSet)
            System.out.println("Bao Tay Sấm Sét");
        else if(this.loaiVatPham==_HonDaKichNo)
            System.out.println("Hòn Đá Kích Nổ");
        else if(this.loaiVatPham==_CayRiuPhepThuat)
            System.out.println("Cây Rìu Phép Thuật");
        else if(this.loaiVatPham==_CayGayChienThan)
            System.out.println("Cây Gậy Chiến Thần");
        System.out.println(" có chỉ số sức mạnh là: "+getChiSoSucManh()+" có hệ số sức mạnh là "+getHeSoSucManh());
        System.out.println("có sức công phá là "+SucCongPha());
        System.out.println("số vàng quy đổi trên sức công phá để mua:"+SoVangTrenSucCongPha());
    }
    public float SucCongPha(){
        return getChiSoSucManh()*getHeSoSucManh();
    }
    public float SoVangTrenSucCongPha(){
        return SucCongPha()*getSoVangQuyDoi();
    }

}

package Bai3;

public class NhanVienQUANLI extends NhanVienCLcao{
     public double  phucapCV;
     public void phucapCV() {
    	 System.out.println("Phụ cấp : ");
    	 phucapCV=s.nextDouble();
    	 s.nextLine();
     };
     public void InThongTinNVQL() {
    	 System.out.println("Tên : " + TenNguoi + "Năm sinh : " + NamSinh + "Lương : "  + Luong + "Ngày nhận việc : " + NgayNhanViec +"PBK : "+ PBK +"Trinh độ : "+ Trinhdo +"Ngành : " + Nganh +"Phu cap cv : "+phucapCV );
    	 
     }
}

package Bai3;

public class GiaoVien extends NhanVienCLcao {
	public double ThulaoGiaoVien;

	public void ThulaogiaoVien() {
		System.out.println("Thù lao giáo viên : ");
		ThulaoGiaoVien = s.nextDouble();
	}

	public void InThongTinGiaoVien() {
		System.out.println(
				"Tên : " + TenNguoi + "Năm sinh : " + NamSinh + "Lương : " + Luong + "Ngày nhận việc : " + NgayNhanViec
						+ "PBK : " + PBK + "Trinh độ : " + Trinhdo + "Ngành : " + Nganh + "Phu cap cv : " + ThulaoGiaoVien);

	}
}

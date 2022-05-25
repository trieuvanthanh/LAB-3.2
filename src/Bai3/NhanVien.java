package Bai3;

public class NhanVien extends Nguoi {
	public  double Luong;
	public  String NgayNhanViec;
	// phong ban khoa
	public String PBK;

	public void Nhap() {
		Nguoi();
		System.out.println("Nhập vào Lương : ");
		Luong = s.nextDouble();
		s.nextLine();
		System.out.println("NgayNhanViec");
		NgayNhanViec = s.nextLine();
		System.out.println("Phòng ban khoa ");
		PBK = s.nextLine();
	}
}

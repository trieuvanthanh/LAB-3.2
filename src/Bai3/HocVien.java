package Bai3;

import java.util.*;

public class HocVien extends Nguoi {
	private Double Diem1, Diem2, Diem3;

	public void Nhap() {
		Nguoi();
		System.out.println("Điểm1,2,3 : ");
		Diem1 = s.nextDouble();
		Diem2 = s.nextDouble();
		Diem3 = s.nextDouble();s.nextLine();
	}
	public void  InThongTinHV() {
		System.out.println("Tên : " +TenNguoi + " Năm Sinh : " + NamSinh + " Điểm : " + Diem1 +" "+ Diem2 + " " + Diem3);
	}
}

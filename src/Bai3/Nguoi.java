package Bai3;

import java.util.*;

public class Nguoi {
	public  String TenNguoi;
	public  String NamSinh;
	public static Scanner s = new Scanner(System.in);

	public void Nguoi() {
		System.out.println("Nhập vào Tên : ");
		TenNguoi = s.nextLine();
		System.out.println("Năm Sinh : ");
		NamSinh = s.nextLine();
	}

}

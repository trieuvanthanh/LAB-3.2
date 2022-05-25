package Bai3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HocVien hv1 = new HocVien();
		hv1.Nhap();
		HocVien hv2 = new HocVien();
		hv2.Nhap();
		HocVien hv3 = new HocVien();
		hv3.Nhap();
		// IN thong tin 3 học viên
		hv1.InThongTinHV();
		hv2.InThongTinHV();
		hv3.InThongTinHV();
		NhanVienQUANLI nv1 = new NhanVienQUANLI();
		PhongBanKhoa pbk = new PhongBanKhoa();
		nv1.Nhap();
		pbk.PhongBanKhoa();
		nv1.NhanVienCLCAO();
		nv1.phucapCV();
		nv1.InThongTinNVQL();
		pbk.In();
		NhanVienQUANLI nv2 = new NhanVienQUANLI();
		nv2.Nhap();
		pbk.PhongBanKhoa();
		nv2.NhanVienCLCAO();
		nv2.phucapCV();
		nv2.InThongTinNVQL();
		pbk.In();
		NhanVienQUANLI nv3 = new NhanVienQUANLI();
		nv3.Nhap();
		pbk.PhongBanKhoa();
		nv3.NhanVienCLCAO();
		nv3.phucapCV();
		nv3.InThongTinNVQL();
		pbk.In();
		GiaoVien gv1 = new GiaoVien();
		PhongBanKhoa P = new PhongBanKhoa();
		gv1.Nhap();
		P.PhongBanKhoa();
		gv1.NhanVienCLCAO();
		gv1.ThulaogiaoVien();
		gv1.InThongTinGiaoVien();
		P.In();
		GiaoVien gv2 = new GiaoVien();
		PhongBanKhoa P2 = new PhongBanKhoa();
		gv2.Nhap();
		P2.PhongBanKhoa();
		gv2.NhanVienCLCAO();
		gv2.ThulaogiaoVien();
		gv2.InThongTinGiaoVien();
		P.In();
		GiaoVien gv3 = new GiaoVien();
		PhongBanKhoa P3 = new PhongBanKhoa();
		gv3.Nhap();
		P3.PhongBanKhoa();
		gv3.NhanVienCLCAO();
		gv3.ThulaogiaoVien();
		gv3.InThongTinGiaoVien();
		P3.In();
	}
}

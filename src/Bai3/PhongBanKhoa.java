package Bai3;
import java.util.*;
public class PhongBanKhoa {
      public int MaPBK;
      public String TenPBK;
      public static Scanner s= new Scanner(System.in);
      public void PhongBanKhoa(){
    	  System.out.println("Mã phòng ban : ");
    	  MaPBK =s.nextInt();
    	  s.nextLine();
    	  System.out.println("Tên phòng ban : ");
    	  TenPBK=s.nextLine();
      }
      public void In() {
    	  System.out.println("Mã PHÒNG BAN : " + MaPBK);
    	  System.out.println("Tên phòng ban : " + TenPBK);
      }
}

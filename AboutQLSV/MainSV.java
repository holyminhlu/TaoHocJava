package AboutQLSV;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSV {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
	        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
	        ArrayList<CT_DaoTao> danhSachQuanLi = new ArrayList<CT_DaoTao>();
	        
	        System.out.print("Số lượng nhân viên: ");
	        int soLuongNhanVien = scanner.nextInt();
	        scanner.nextLine();
	        ///////////////////////////////////////////////////
	        for (int i = 0; i < soLuongNhanVien; i++) {
	     
	            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
	            System.out.print("ID: ");
	            String ID = scanner.nextLine();
	            System.out.print("Name: ");
	            String Name = scanner.nextLine();
	            System.out.print("Nam Bat Dau: ");
	            int YearSt = scanner.nextInt();
	            
	            scanner.nextLine();
	            
	            System.out.print("Nganh Dao Tao: ");
	            String nganhDaoTao = scanner.nextLine();
	            System.out.print("Thoi Gian Dao Tao: ");
	            String thoiGianDaoTao = scanner.nextLine();
	            System.out.print("Hoc Phi Chuong Trinh Dao Tao (Triệu Vnđ): ");
	            int hocPhi = scanner.nextInt();
	            scanner.nextLine();
	            
	            SinhVien sinhvien = new SinhVien(ID, Name, YearSt);
	            danhSachSinhVien.add(sinhvien);
	            
	            CT_DaoTao ctdaotao = new CT_DaoTao(ID, Name, YearSt, nganhDaoTao, thoiGianDaoTao, hocPhi);
	            danhSachQuanLi.add(ctdaotao);
	        }
	        
	        System.out.println("\nThông tin chương trình đào tạo:");
	        for (CT_DaoTao dt : danhSachQuanLi) {
	        	 System.out.println("\n");
	            dt.xuatInfor();
	        }
	}

}

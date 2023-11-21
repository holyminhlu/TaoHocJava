package Worker;
import java.util.Scanner;
public class main_CongNhan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong cong nhan: ");	
		int soluong = sc.nextInt();
		CongNhan cn = new CongNhan();
		CongNhan[] ds = new CongNhan[soluong];
		for( int i=0; i<soluong; i++) {
			System.out.println("\tNhap thong tin sinh vien thu "+(i+1)+": ");	
			sc.nextLine();
			cn.nhapho(); String HoNV = sc.nextLine();
			cn.nhapten(); String TenNV = sc.nextLine();
			cn.nhaptuoi(); int TuoiNv = sc.nextInt();
			cn.nhapluong(); double Luong = sc.nextDouble();
			
		ds[i] = new CongNhan(HoNV,TenNV,TuoiNv,Luong);
		}
	    System.out.println("\tDANH SACH CONG NHAN DANG LAM VIEC");
	    System.out.printf("%-20s%-15s%-10s%-15s\n", "Ho", "Ten", "Tuoi", "Luong");
		for (int i = 0; i < soluong; i++) {
            ds[i].xuatDanhSach();
        }
		
		System.out.print("Nhập tên nhân viên cần xóa: ");
        String tenNV = new Scanner(System.in).nextLine();
        int viTri = -1;
        for (int i = 0; i < soluong; i++) {
            if (ds[i].getTenNV().equals(tenNV)) {
                viTri = i;
                break;
            }
        }
        if (viTri != -1) {
            for (int i = viTri; i < soluong - 1; i++) {
                ds[i] = ds[i + 1];
            }
           ds[soluong-1] = null;
           soluong--;
            
          System.out.println("\tDANH SACH CONG NHAN SAU KHI XOA");
   	    System.out.printf("%-20s%-15s%-10s%-15s\n", "Ho", "Ten", "Tuoi", "Luong");
   		for (int i = 0; i < soluong; i++) {
   			if( ds[i] != null ) {
               ds[i].xuatDanhSach();
               }
   			}
         } else {
            System.out.println("Không tìm thấy nhân viên có tên " + tenNV);
   		}
	}
}

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class mainNv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhapnv = new Scanner(System.in);
		System.out.println("Nhap Ho nhan vien: ");
		String honv = nhapnv.nextLine();
		System.out.println("Nhap Ten nhan vien: ");
		String tennv = nhapnv.nextLine();
		//Date newdate = new Date();
		System.out.println("Nhap ngay sinh nhan vien: ");
		String ngaysinh = nhapnv.nextLine();
		System.out.println("Nhap ngay bat dau lam nhan vien: ");
		String ngaystart = nhapnv.nextLine();
		
		Employee nv = new Employee(honv,tennv,ngaysinh,ngaystart);
			nv.xuatNv();
	}

}

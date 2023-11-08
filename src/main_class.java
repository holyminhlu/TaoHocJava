import java.util.Scanner;
public class main_class {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu rong len: ");
		int len = nhap.nextInt();
		System.out.print("Nhap chieu dai wid: ");
		int wid = nhap.nextInt();
		Rectangle rect = new Rectangle(len,wid);
		System.out.println("Chu vi: "+rect.tinhchuvi());
		System.out.println("Duong cheo: "+rect.tinhdgcheo());
		System.out.println("Duong cheo: "+rect.tinhdientich());
		System.out.print("Kiem tra vuong: "+rect.ktra_vuong());
		System.out.print("\n");
		rect.xuat_widlen();
		rect.vehinh('-');
		
	}

}

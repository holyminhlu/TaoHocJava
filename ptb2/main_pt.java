package ptb2;

import java.util.Scanner;

public class main_pt {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so a ( a!=0 ): ");
		double a = nhap.nextInt();
		System.out.print("Nhap so b: ");
		double b = nhap.nextInt();
		System.out.print("Nhap so c: ");
		double c  = nhap.nextInt();
		ptbac2 pt2 = new ptbac2(a,b,c);
		if(a==0 ){
			System.out.print("PT bac 2 Khong the tinh");
			return;
		}
		pt2.giaiptb2();
		}
	}


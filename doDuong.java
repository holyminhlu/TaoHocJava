//HO LY MINH LU - DA22TTB - 110122231
//LAP TRINH HDT 11/01/2023
import java.util.Scanner;
public class doDuong {
		public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				int n, tong =0;
				float a,b,c;
				int a1,b1,c1,d1;
				double x,y,z, nghiem, nghiem1, nghiem2;
				boolean ktra = false;
				boolean ktra1= false;boolean ktra2= false;
				System.out.print("\tTINH TONG TU 1 DEN N SO NGUYEN DUONG");
				System.out.print("\nNhap vao so nguyen duong n: ");
				n = input.nextInt();
				for( int i=1; i<=n; i++){
					tong += i;
				}
				System.out.print("Tong cac so tu 1 den n la: "+tong);
				// tam giac
				System.out.print("\n");
				System.out.print("\n\tKIEM TRA CAC DIEU KIEN CUA TAM GIAC");
				System.out.print("\n");
				System.out.print("Nhap vao so thuc a: ");
				a = input.nextFloat();
				System.out.print("Nhap vao so thuc b: ");
				b = input.nextFloat();
				System.out.print("Nhap vao so thuc c: ");
				c = input.nextFloat();
				//
				if( a+b>c && a+c>b && b+c>a ){
				System.out.println("Co the tao thanh tam giac tu ba so thuc a,b,c: ");
				if( a==b && b==c ){
				System.out.println("Tam giac duoc tao la tam giac deu");
				}else if( a==b || a==c || b==c ){
				System.out.println("Tam giac duoc tao la tam giac can");
				ktra1 = true;
				}else if(a*a == b*b+c*c || b*b == a*a+c*c  || c*c == a*a+b*b  ){
				System.out.println("Tam giac la tam giac vuong ");
				ktra2 = true;
				}else if( ktra1 == true && ktra2 == true){
				System.out.println("Tam giac la tam giac vuong can ");
				}else{
				System.out.println("Tam giac la tam giac thuong ");
		        }
}else{
	System.out.println("Khong the tao thanh mot tam giac");
}
				System.out.print("\n");
				// min max
				System.out.print("\tTIM MAX TRONG 4 SO NGUYEN DUONG");
				System.out.print("\nNhap vao so nguyen duong thu nhat: ");
				a1 = input.nextInt();
				while( a1<0 ){
					System.out.print("Nhap sai !! Nhap lai so nguyen duong thu nhat: ");
					a1 = input.nextInt();
				}
				System.out.print("Nhap vao so nguyen duong thu hai: ");
				b1 = input.nextInt();
				while( b1<0 ){
					System.out.print("Nhap sai !! Nhap lai so nguyen duong thu nhat: ");
					b1 = input.nextInt();
				}
				System.out.print("Nhap vao so nguyen duong thu ba: ");
				c1 = input.nextInt();
				while( c1<0 ){
					System.out.print("Nhap sai !! Nhap lai so nguyen duong thu nhat: ");
					c1 = input.nextInt();
				}
				System.out.print("Nhap vao so nguyen duong thu tu: ");
				d1 = input.nextInt();
				while( d1<0 ){
					System.out.print("Nhap sai !! Nhap lai so nguyen duong thu nhat: ");
					d1 = input.nextInt();
				}
				//
				int max = a1;
				if( b1 > max){
					max = b1;
				}if( c1 > max){
					max = c1;
				}if( d1 > max){
					max = d1;
				}
				System.out.print("So lon nhat trong 4 so vua nhap la: "+max);
				//pt bac 2 in java
				System.out.print("\n");
				System.out.print("\n\tGIAI PHUONG TRINH BAC 2 ");
				System.out.print("\n");
				System.out.print("Nhap vao so thuc a: ");
				x = input.nextDouble();
				while( x==0 ){
					System.out.print("Nhap sai a != 0. Nhap lai so nguyen duong thu nhat: ");
					x = input.nextInt();
				}
				System.out.print("Nhap vao so thuc b: ");
				y = input.nextDouble();
				System.out.print("Nhap vao so thuc c: ");
				z = input.nextDouble();
				double denta = (y*y) - (4*x*z);
				if( denta < 0 ){
				System.out.print("Phuong trinh vo nghiem");
				}
				if( denta == 0 ){
					nghiem = (-y)/2*x;
				System.out.print("Phuong trinh co nghiem kep: "+nghiem);
				}
				if( denta > 0 ){
					nghiem1 = (((-y)+Math.sqrt(denta))/2*a);
					nghiem2 = (((-y)-Math.sqrt(denta))/2*a);
				System.out.print("Phuong trinh co hai nghiem phan biet: x1 = "+nghiem1+" va x2 = "+nghiem2);
		}
	}
}

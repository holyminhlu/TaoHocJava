import java.util.Scanner;
public class uc_avg {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao so luong phan tu cho mang: ");
		n = inp.nextInt();
		int[]a = new int[10];
		//
		for( int i=0; i<n; i++ ){
			System.out.print("Nhap vao phan tu thu"+i+":" );
			a[i] = inp.nextInt();
		}
		System.out.print("Phan tu cua mang la SNT \n");
		for( int i=0; i<n; i++){
			if( nt(a[i]) ){
				System.out.println("a[i]"+a[i]+"la snt");
			}
		}
		int uc = a[0];
		for( int i=1; i<n; i++ ){
			uc = uc( uc, a[i]);
		}
		System.out.println("UC cua ca phan tu trog mang: "+uc);
	}
public static boolean nt(int n){
		if( n<= 1 ){
			return false;
		}
		for( int i=2; i*i<= n; i++){
			if( n%i== 0){
				return false;
			}
		}
		return true;
	}
public static int uc( int a, int b ){
	if( b==0 ){ return a; }
	return uc(b, a%b);
}
}

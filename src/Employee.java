import java.util.Date;
public class Employee {
	private String honv;
	private String tennv;
	private String ngaysinh;
	private String ngaystart;
	//
	public Employee(String honv,String tennv,String ngaysinh,String ngaystart){
		this.honv=honv;
		this.tennv=tennv;
		this.ngaysinh=ngaysinh;
		this.ngaystart=ngaystart;
	}
	public String getHonv() {
		return honv;
	}
	public void setHonv(String honv) {
		this.honv = honv;
	}
	public String getTennv() {
		return tennv;
	}
	public void setTennv(String tennv) {
		this.tennv = tennv;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getNgaystart() {
		return ngaystart;
	}
	public void setNgaystart(String ngaystart) {
		this.ngaystart = ngaystart;
	}
public void xuatNv(){
	System.out.println("Ho nhan vien: "+this.honv);
	System.out.println("Ten nhan vien: "+this.tennv);
	System.out.println("Ngay sinh nhan vien: "+this.ngaysinh);
	System.out.println("Ngay bat dau lam: "+this.ngaystart);
}
}

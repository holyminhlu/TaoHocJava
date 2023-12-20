package AboutQLSV;

public class CT_DaoTao extends SinhVien {
	private String nganhDaoTao;
	private String thoiGianDaoTao;
	private double hocPhi;
	public CT_DaoTao(String iD, String name, int yearSt, String nganhDaoTao, String thoiGianDaoTao, double hocPhi) {
		super(iD, name, yearSt);
		this.nganhDaoTao = nganhDaoTao;
		this.thoiGianDaoTao = thoiGianDaoTao;
		this.hocPhi = hocPhi;
	}
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	public String getThoiGianDaoTao() {
		return thoiGianDaoTao;
	}
	public void setThoiGianDaoTao(String thoiGianDaoTao) {
		this.thoiGianDaoTao = thoiGianDaoTao;
	}
	public double getHocPhi() {
		return hocPhi;
	}
	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}
	@Override
	public void xuatInfor(){
		super.xuatInfor();
		System.out.println("Nganh Dao Tao: "+this.nganhDaoTao);
		System.out.println("Thoi Gian Dao Tao: "+this.thoiGianDaoTao);
		System.out.println("Hoc phi: "+this.hocPhi);
	}
	
}

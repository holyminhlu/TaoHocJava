package AboutVV;

public class QuanLi extends NhanVien {
	private String chucvu;
	private String phongban;
	public QuanLi(String iD, String name, String chucvu, String phongban) {
		super(iD, name);
		this.chucvu = chucvu;
		this.phongban = phongban;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public String getPhongban() {
		return phongban;
	}
	public void setPhongban(String phongban) {
		this.phongban = phongban;
	}
	
	@Override
	public void xuatInfor(){
		super.xuatInfor();
		System.out.println("Chuc vu: "+this.chucvu+ "Phong ban "+this.phongban);
	}
}

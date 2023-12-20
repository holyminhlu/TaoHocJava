package AboutQLSV;

public class SinhVien {
	private String ID;
	private String Name;
	private int YearSt;
	public SinhVien(String iD, String name, int yearSt) {
		ID = iD;
		Name = name;
		YearSt = yearSt;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYearSt() {
		return YearSt;
	}
	public void setYearSt(int yearSt) {
		YearSt = yearSt;
	}
	
	public void xuatInfor(){
		System.out.println("ID: "+this.ID);
		System.out.println("Name: "+this.Name);
		System.out.println("Year Start: "+this.YearSt);
	}	
}

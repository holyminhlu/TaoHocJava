package AboutVV;

public class NhanVien {
	private String ID;
	private String Name;
	public NhanVien(String iD, String name) {

		ID = iD;
		Name = name;
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
	
	public void xuatInfor() {
		System.out.println("ID: "+this.ID+ "Name: "+this.Name);
	}
	
}

package Worker;

public class CongNhan {
		private String HoNV;
		private String TenNV;
		private int TuoiNV;
		private double Luong;
		
		public CongNhan() {
			this.TuoiNV = 18;
			this.Luong = 1500000.0;
		}
		public CongNhan(String hoNV, String tenNV, int TuoiNV, double luong) {
			this.HoNV = hoNV;
			this.TenNV = tenNV;
			this.TuoiNV = TuoiNV;
			this.Luong = luong;
		}
		
		public String getHoNV() {
			return HoNV;
		}
		public void setHoNV(String hoNV) {
			HoNV = hoNV;
		}
		public String getTenNV() {
			return TenNV;
		}
		public void setTenNV(String tenNV) {
			TenNV = tenNV;
		}
		public int getTuoiNV() {
			return TuoiNV;
		}
		public void setTuoiNV(int tuoiNV) {
			TuoiNV = tuoiNV;
		}
		public double getLuong() {
			return Luong;
		}
		public void setLuong(double luong) {
			Luong = luong;
		}
		public void nhapho() {
			System.out.print("Ho: ");	
		}
		public void nhapten() {
			System.out.print("Ten: ");	
		}
		public void nhaptuoi() {
			System.out.print("Tuoi: ");	
		}
		public void nhapluong() {
			System.out.print("Luong: ");	
		}
		@Override
		public String toString() {
			return String.format("%-20s%-15s%-10s%-15s", HoNV, TenNV, TuoiNV, Luong);
		}
		public void xuatDanhSach() {
	        System.out.printf("%-20s%-15s%-10s%-15s\n", HoNV, TenNV, TuoiNV, Luong);
	    }
}

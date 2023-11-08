
public class Rectangle {
	private int len; 
	private int wid;
	
	public Rectangle(){ this(10,10); }
	public Rectangle(int len, int wid){
		if( len>=0 && len<=20 && wid >=0 && wid <=20 ){
			this.len = len;
			this.wid = wid;
		}
		//
}
	public void setLen( int len ){
		if( len>=0 && len<=20 ){
			this.len=len;
		}while( len<0 && len>20 ){
			System.out.print("Nhap sai pham vi len !.Nhap sai: ");
			this.len = len;
		}
		//
	}
	public int getLen(){ return len; }
	public void setWid( int wid ){
		if( wid>=0 && wid<=20 ){
			this.wid=wid;
		}while( wid<0 && wid>20 ){
			System.out.print("Nhap sai pham vi wid !. Nhap lai: ");
			this.wid=wid;
		}
		//
	}
	public int getWid(){ return wid; }
	public double tinhchuvi(){
		return 2*(len + wid );
	}
	public double tinhdientich(){
		return wid*len;
	}
	public double tinhdgcheo(){
		return Math.sqrt( len*len + wid*wid );
	}
	public void xuat_widlen(){
		System.out.println("["+len+"x"+wid+"]");
	}
	public boolean ktra_vuong(){
		return len == wid;
	}
	public void vehinh( char ch ){
		for( int i=0; i< len; i++){
			for( int j=0; j<wid; j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

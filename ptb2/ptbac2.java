package ptb2;

public class ptbac2 {
	private double a;
	private double b;
	private double c;
public ptbac2() {
	this.a=1;
	this.b=1;
	this.c=1;
	}
public ptbac2( double a, double b, double c){
	this.a=a;
	this.b=b;
	this.c=c;
	}
public void setA( double a ){
	if( a != 0 ){
		this.a=a;
	}while( a==0 ){
		System.out.print("PT bac 2 a != 0, Nhap lai:");
		this.a = a;
	}
}
public double getA(){ return a; }
//
public void setB( double b ){this.b=b;}
public double getB(){ return b; }
//
public void setC( double c ){this.c=c;}
public double getC(){ return c; }
//
public double denta(){
	return Math.pow(this.b, 2)-4*this.a*this.c;
}
public void giaiptb2(){
	double denta = this.denta();
	if( denta >0 ){
			double x1 =	(-this.b + Math.sqrt(denta))/(2*this.a);
			double x2 =	(-this.b - Math.sqrt(denta))/(2*this.a);
	System.out.println("Nghiem x1: "+x1);
	System.out.println("Nghiem x2: "+x2);
	}else if( denta == 0 ){
			double x3 = -this.b/(2*this.a);
			System.out.print("Nghiem kep: "+x3);
}else{
	System.out.print("Phuong trinh vo nghiem !!");
	}
}
}


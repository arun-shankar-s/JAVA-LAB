package ifsample;

public class CompNum {
	double real;
	double img;
	public CompNum(double r,double i) {
		this.real=r;
		this.img=i;
	}

	public static CompNum sum(CompNum c1,CompNum c2) {
		double real1=c1.real+c2.real;
		double img1=c1.img+c2.img;
		return new CompNum(real1,img1);
		
	}
	public static void main(String[] args) {
		CompNum a1=new CompNum(2,3);
		CompNum a2=new CompNum(3,-1);
		CompNum a3=sum(a1,a2);
		System.out.println("Sum is "+a3.real+" + "+a3.img+"i");

	}

}

package ifsample;

import java.util.*;
public class Prgm1 {

	public void area(int length) {
		int area=length*length;
		System.out.println("Area of Square="+area);
	}
	public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle="+area);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Prgm1 f0=new Prgm1();
		System.out.println("Enther the length of Square");
		int l=sc.nextInt();
		f0.area(l);
		System.out.println("Enther the length of rectangle");
		int le=sc.nextInt();
		System.out.println("Enther the breadth of Square");
		int br=sc.nextInt();
		f0.area(le,br);
		sc.close();
	}

}

package ifsample;

import java.util.Scanner;

public class Teacher extends Employee1 {
	String Dept;
	Teacher(String a, String b, String c,int d,double e,String f){
		super(a,b,c,d,e);
		this.Dept=f;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.of teachers");
		int n=sc.nextInt();
		Teacher[] tr=new Teacher[n];
		for(int i=0;i<n;i++) {
    		System.out.println("Enter detais for Employee "+(i+1));
			System.out.println("Enter the name");
			String a=sc.next();
			System.out.println("Enter the Gender");
			String b=sc.next();
			System.out.println("Enter the Address");
			String c=sc.next();
			System.out.println("Employee ID:");
    		int d=sc.nextInt();
    		System.out.println("Employee Salary:");
    		double e=sc.nextDouble();
    		System.out.println("Enter the Dept");
			String f=sc.next();
			tr[i]=new Teacher(a,b,c,d,e,f);
			
		}
		
		System.out.println("Enter the TEACHER ID TO BE SEARCHED");
		int sno=sc.nextInt();
		boolean found=false;
		for(Teacher teacher:tr) {
			if(teacher.eno==sno) {
				found=true;
				System.out.println("Employee ID: " + teacher.eno);
                System.out.println("Name: " + teacher.name);
                System.out.println("Gender: " + teacher.gender);
                System.out.println("Address: " + teacher.Addr);
                System.out.println("Salary: " + teacher.esalary);
                System.out.println("Department: " + teacher.Dept);
    			break;			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}

}

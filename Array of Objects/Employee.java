package ifsample;

import java.util.*;
public class Employee {
		int eno;
		String ename;
		double esalary;
		
		public Employee(int eno1, String ename1, double esalary1) {
	        this.eno = eno1;
	        this.ename = ename1;
	        this.esalary = esalary1;
		}
	        
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	
	    	System.out.println("Enter the no.of employee");
	    	int n=sc.nextInt();
	    	Employee[] employees=new Employee[n];
	    	for(int i=0;i<n;i++) {
	    		sc.nextLine();
	    		System.out.println("Enter detais for Employee "+(i+1));
	    		System.out.println("Employee ID:");
	    		int eno=sc.nextInt();
	    		System.out.println("Employee Name:");
	    		String ename=sc.next();
	    		System.out.println("Employee Salary:");
	    		double esalary=sc.nextInt();
	    		employees[i]=new Employee(eno,ename,esalary);
	    		
	    	}
	    	System.out.println("Enter Employees to Search:");
	    	int sno=sc.nextInt();
	    	boolean found=false;
	    	for(Employee emp:employees) {
	    		if(emp.eno==sno) {
	    			found=true;
	    			System.out.println("Emp ID:"+emp.eno);
	    			System.out.println("Emp ID:"+emp.ename);
	    			System.out.println("Emp ID:"+emp.esalary);
	    			break;
	    		}
	    	}
	    	if(!found) {
	    		System.out.println("Employee not found");
	    	}
	    	sc.close();	    	}
		
	}


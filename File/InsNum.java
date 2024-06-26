package ifsample;

import java.io.*;
import java.util.Scanner;

public class InsNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			FileWriter f0=new FileWriter("D:\\New folder (2)\\Cont.txt" );
			
			 System.out.println("Enter numbers to write to the file (type 'exit' to finish):");
	            while (true) {
	                String input = sc.next();
	                if (input.equalsIgnoreCase("exit")) {
	                    break;
	                }
	                try {
	                    int number = Integer.parseInt(input);
	                    f0.write(number + "\n");
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input. Please enter an integer or 'exit' to finish.");
	                }	            }
	            f0.close();
	            sc.close();
	            System.out.println("Numbers written to the file successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package ifsample;

import java.io.*;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		try {
			FileInputStream f0=new FileInputStream("D:\\New folder (2)\\a.txt");
			Scanner f1=new Scanner(f0);
			
			FileOutputStream even=new FileOutputStream("D:\\New folder (2)\\even.txt");
			FileOutputStream odd=new FileOutputStream("D:\\New folder (2)\\odd.txt");

			 while (f1.hasNextInt()) {
	                int number = f1.nextInt();
	                if (number % 2 == 0) {
	                    even.write((number + "\n").getBytes());
	                } else {
	                    odd.write((number + "\n").getBytes());
	                }
	            }
			 System.out.println("sUCCESSFULL");
			 f1.close();
			 f0.close();
			 odd.close();
			 even.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
;
	}

}

package ifsample;

import java.io.FileWriter;
import java.util.Scanner;

public class InsChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			FileWriter f0=new FileWriter("D:\\New folder (2)\\c.txt" );
			
			 System.out.println("Enter characters to write to the file (type 'exit' to finish):");
	            while (true) {
	                String input = sc.next();
	                if (input.equalsIgnoreCase("exit")) {
	                    break;
	                }
	                
	                	for (char ch : input.toCharArray()) {
	                        f0.write(ch);
	                    }
	                    f0.write('\n');
	                
	            }
	            f0.close();
	            sc.close();
	            System.out.println("Characters written to the file successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

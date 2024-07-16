package ifsample;

import java.io.*;
public class Copy1 {

	public static void main(String[] args) {
		try {
			FileInputStream f2=new FileInputStream("C:\\Users\\aruns\\Desktop\\New folder (2)\\b.txt");
			FileOutputStream f3=new FileOutputStream("C:\\Users\\aruns\\Desktop\\New folder (2)\\a.txt");
		    int  i;
			while((i=f2.read())!=-1) {
				f3.write(i);
			}
			f2.close();
			f3.close();
			System.out.println("Copied");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

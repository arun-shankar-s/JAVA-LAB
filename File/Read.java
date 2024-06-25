package ifsample;

import java.io.FileReader;

public class Read {

	public static void main(String[] args) {
		
		char[] arr=new char[12];
		try {
			
			FileReader f2=new FileReader("D:\\New folder (2)\\a.txt");
			
		 f2.read(arr);
		 System.out.println(arr);
		 f2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

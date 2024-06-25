package ifsample;


import java.io.FileWriter;



public class Write {

	public static void main(String[] args) {
		String data="Hello Wolrd";
		try {
		FileWriter f1=new FileWriter("D:\\New folder (2)\\a.txt");
		f1.write(data);
		System.out.println("Succefully Written");
		f1.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

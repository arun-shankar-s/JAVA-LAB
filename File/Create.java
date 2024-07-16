package ifsample;

import java.io.*;
public class Create {

	public static void main(String[] args) {
		try {
			File f0=new File("D:\\New folder (2)\\a.txt");
			if(f0.createNewFile()) {
				System.out.println("The File "+f0.getName()+" is Successfully Created");
				
			}
			else {
				System.out.println("File Creation Failed");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

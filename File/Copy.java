package ifsample;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
	public static void main(String[] args) {
		try {
			FileInputStream r=new FileInputStream("D:\\New folder (2)\\a.txt");
			FileOutputStream w=new FileOutputStream("D:\\New folder (2)\\b.txt");
			int i;
			while((i=r.read())!=-1) {
				w.write((char)i);
			}
			System.out.println("Data Copied Succesfully");
			File f0=new File("D:\\New folder (2)\\b.txt");
			if(Desktop.isDesktopSupported()) {
				Desktop desktop=Desktop.getDesktop();
				if(f0.exists()) {
					desktop.open(f0);
				}
				else {
					System.out.println("Not Supported");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

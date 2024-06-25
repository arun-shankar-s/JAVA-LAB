package ifsample;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Desk {

	public static void main(String[] args) {
        File f0 = new File("D:\\New folder (2)\\a.txt");

		if(Desktop.isDesktopSupported()) {
			Desktop f=Desktop.getDesktop();
		
			if(f0.exists()) {
				try {
					f.open(f0);
				} catch (IOException e) {
					// TODO -generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}

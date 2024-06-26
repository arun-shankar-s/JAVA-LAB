package ifsample;

import java.io.*;

public class Vowels {
	
	static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

	public static void main(String[] args) {
		try {
			FileReader f0=new FileReader("D:\\New folder (2)\\vowels.txt");
			FileWriter f1=new FileWriter("D:\\New folder (2)\\vowel.txt");
			int c;
			while((c=f0.read())!=-1) {
				char ch=(char)c;
				if (isVowel(ch)) {
					f1.write(ch);
				}
			}
            System.out.println("Vowels have been successfully written to the output file.");

			f0.close();
			f1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
	}

}

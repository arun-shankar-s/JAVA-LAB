package ifsample;

import java.io.File;
import java.io.IOException;

class File5 {
    public static void main(String[] args) {
        try {
            File f0 = new File("D:\\New folder (2)\\a.txt");
            if (f0.createNewFile()) {
                System.out.println("The File " + f0.getName() + " is Successfully Created");
            } else {
                System.out.println("The File " + f0.getName() + " already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

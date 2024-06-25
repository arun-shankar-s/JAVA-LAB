package ifsample;

import java.io.*;
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        try {
            do {
                System.out.println("***FILE OPERATIONS***");
                System.out.println("1. CREATE");
                System.out.println("2. WRITE");
                System.out.println("3. READ");
                System.out.println("4. DELETE");
                System.out.println("5. COPY");
                System.out.println("Enter your choice");
                int ch = sc.nextInt();
                sc.nextLine(); 

                switch (ch) {
                    case 1:
                        System.out.println("Enter File Name");
                        String fname = sc.next();
                        File f0 = new File("D:\\New folder (2)\\" + fname);
                        if (f0.createNewFile()) {
                            System.out.println("File " + f0.getName() + " created Successfully");
                        } else {
                            System.out.println("Already Exists");
                        }
                        break;
                    case 2:
                        System.out.println("Enter File Name");
                        String fname1 = sc.next();
                        FileWriter f1 = new FileWriter("D:\\New folder (2)\\" + fname1);
                        System.out.println("Enter the text");
                        sc.nextLine();
                        String text = sc.nextLine();
                        f1.write(text);
                        f1.close();
                        System.out.println("Text written to the file successfully");
                        break;
                    case 3:
                        System.out.println("Enter File Name");
                        String fname2 = sc.next();
                        FileReader f2 = new FileReader("D:\\New folder (2)\\" + fname2);
                        char[] arr = new char[100];
                        f2.read(arr);
                        System.out.println(arr);
                        f2.close();
                        break;
                    case 4:
                        System.out.println("Enter File Name");
                        String fname3 = sc.next();
                        File f3 = new File("D:\\New folder (2)\\" + fname3);
                        if (f3.delete()) {
                            System.out.println("Deleted Successfully");
                        } else {
                            System.out.println("Not Deleted");
                        }
                        break;
                    case 5:
                        System.out.println("Enter Source File Name");
                        String fname4 = sc.next();
                        FileInputStream r = new FileInputStream("D:\\New folder (2)\\" + fname4);
                        System.out.println("Enter Destination File Name");
                        String fname5 = sc.next();
                        FileOutputStream w = new FileOutputStream("D:\\New folder (2)\\" + fname5);
                        int i;
                        while ((i = r.read()) != -1) {
                            w.write(i);
                        }
                        r.close();
                        w.close();
                        System.out.println("Data Copied Successfully");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

                System.out.println("Do you want to continue? (Y/N)");
                choice = sc.next();
            } while (choice.equalsIgnoreCase("Y"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

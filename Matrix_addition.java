package ifsample;

import java.util.*;
public class Add {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows and cols");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int[][] matrix1=new int[rows][cols]	;
		int[][] matrix2=new int[rows][cols]	;
		int[][] result=new int[rows][cols]	;
		int i,j;
		System.out.println("Enter elements of first matrix");
		for(i=0;i<rows;i++) {
			System.out.println("Enter the "+(i+1)+" row");
			for(j=0;j<cols;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of second matrix");
		for(i=0;i<rows;i++) {
			System.out.println("Enter the "+(i+1)+" row");

			for(j=0;j<cols;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		System.out.println("Sum pf matrix is");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

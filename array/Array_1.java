package dsa_array;

import java.util.Scanner;

public class Array_1 {
	public static void main(String[] args) {
// data_type [] name= new data_type[size]
		
	
		char[] arr1=new char[3];
		arr1[0]='a';
		arr1[1]='v';
		arr1[2]='B';
		for(char a:arr1) {
			System.out.println(a);
		}
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number:");
			int a=sc.nextInt();
			System.out.println(a);
			int[] dd = new int[a];
			dd[0]=1;
			System.out.println(dd[0]);
		}
		
	}

}

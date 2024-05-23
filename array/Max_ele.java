package dsa_array;

import java.util.Scanner;

public class Max_ele {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int [] arr= new int[n];
			for(int i=0;i<n;i++) {
				int a = s.nextInt();
				arr[i]=a;
			}
			
			int max = arr[0];
			for(int i=1;i<n;i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			System.out.println("maximum value:"+max);
		}
	}

}

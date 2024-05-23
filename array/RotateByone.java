package dsa_array;

public class RotateByone {
	public static void lRotate(int arr[],int n) {
		int temp = arr[0];
		for(int i = 1;i<n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1]  = temp;
		
	}

	public static void main(String[] args) {
		
		  int arr[] = {1, 2, 3, 4, 5}, n = 5;

	       System.out.println("Before Rotation");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();
	       
	       int k = 2;
	       for(int a=0;a<k;a++) {lRotate(arr, n);}
	       

	       System.out.println("After Rotation");

	       for(int i = 0; i <n ; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
		
	}

}

import java.util.Scanner;

public class Insertion_sort {
	static void insertionsort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int arr_size = sc.nextInt();
		
		System.out.println("Enter array elemets");
		int arr[] = new int[arr_size];
		for(int i=0;i<arr_size;i++) {
			arr[i] = sc.nextInt();
		}
		printArray(arr);
		insertionsort(arr);
		System.out.println("after sorting:");
		printArray(arr);
		
		
	}
	static void printArray(int []arr) {
		System.out.print("array elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
	}

}

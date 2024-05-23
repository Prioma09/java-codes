package dsa_array;

public class A1 {

	public static void main(String[] args) {
		int arr[]= {1,5,6,9,8};
		reversearr(arr);
		printarr(arr);
	}
	public static void printarr(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"   ");
		}
	}
	public static void reversearr(int a[]) {
		int temp;
		int start = 0;
		int end = a.length-1;
		while(start<end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			
		}
	}
}

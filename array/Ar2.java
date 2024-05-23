package dsa_array;

public class Ar2 {

	public static void main(String[] args) {
		int arr[] = {5,9,10,11,9};
		increament(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(isSorted(arr));
	
	}
	public static void increament(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+1;
		}
	}
	public static boolean isSorted(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}

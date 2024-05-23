package dsa_array;

public class Min_max {
	
	
	public static void main(String[] args) {
		int []arr = {5,3,1,4,5};
		Minmaxofarray(arr);
	}

	private static void Minmaxofarray(int[] arr) {
		int n = arr.length;
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			else if(arr[i]<min){
				min = arr[i];
			}
		}
		
		System.out.println(max +" " +min);
	}
}
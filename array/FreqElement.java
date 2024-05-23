package dsa_array;

public class FreqElement {

	public static void main(String[] args) {
		int arr[] ={10,5,10,15,10,5,15,20,15};
	    int n = arr.length;
	    countFreq(arr, n); 
	}

	private static void countFreq(int[] arr, int n) {
		boolean[] vis = new boolean[n];
		
		
		for(int i=0;i<n;i++) {
			if(vis[i] == true) {
				continue;
			}
			int count = 1;
			for(int j = i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
					vis[j] = true;
				}
				
			}
			System.out.println(arr[i]+" "+count);
		}
		
		
	}

}

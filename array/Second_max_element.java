package dsa_array;

public class Second_max_element {
	public static int sec_maxelement(int[] arr) {
		int n = arr.length;
		int res = -1;
		int largest = 0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[largest]) {
				res = largest;
				largest = i;
			}
			else if(arr[i]!=arr[largest]) {
				if(res==-1 || arr[i] > arr[res]) {
					res = i;
				}
			}
		}

		return res;
	}
	public static void main(String[] args) {
		int[] arr = {5,9,8,1,6,38,40};
		int result = sec_maxelement(arr);
		System.out.println(arr[result]);
	}

}

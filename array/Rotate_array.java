package dsa_array;

public class Rotate_array {
	
	static int[][] rotate(int[][] matrix,int l){
		
		int n= matrix.length;
		
		int[][] rotate = new int[n][n];
		for(int k=0;k<l;k++) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				rotate[j][n-i-1]=matrix[i][j];
			}
		}
		}
		
		
		return rotate;
		
	}

	public static void main(String[] args) {
		
		 int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int rotated[][] = rotate(arr,2);
	        System.out.println("Rotated Image");
	        for (int i = 0; i < rotated.length; i++) {
	            for (int j = 0; j < rotated.length; j++) {
	                System.out.print(rotated[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}

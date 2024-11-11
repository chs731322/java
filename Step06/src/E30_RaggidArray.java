import java.util.Arrays;

public class E30_RaggidArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[] {1,2,3,4,5,6};
		
		for(int[] a : arr) {
			for(int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	}

}
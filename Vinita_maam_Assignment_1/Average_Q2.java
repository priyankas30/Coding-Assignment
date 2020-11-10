package Vinita_maam_Assignment_1;

import java.util.Arrays;

public class Average_Q2 {

	public static void main(String[] args) {
		int Arr[] = {12, 35, 1, 10, 34, 1};
		int n=Arr.length;
		secondLargestElement(Arr,n);

	}

	 static void secondLargestElement(int[] Arr, int arr_size) {
		int i;
		if(arr_size < 2) {
			System.out.println("Invalid");
			return;
		}
		
		Arrays.sort(Arr);
		for( i=arr_size-2;i>=0;i--) {
			if(Arr[i] != Arr[arr_size-1]) {
				System.out.println("second lasrget element is "+Arr[i]);
				return;
			}
		}
		
		
		// TODO Auto-generated method stub
		
	}

}

package Vinita_maam_Assignment_1;

public class Q2_Demo {

	public static void main(String[] args) {
		int arr[]={12, 35, 1, 10, 34, 1};
		int n=arr.length;
		secondLargetsElement(arr,n);
	}

	private static void secondLargetsElement(int[] arr, int arr_size) {
		// TODO Auto-generated method stub
		int i;
		if(arr_size < 2) {
			System.out.println("invalid input");
			return;
		}
		for(i=arr_size-2;i>=0;i--) {
			if(arr[i] != arr[arr_size -1]) {
				System.out.println("second larget ele is "+arr[i]);
				return;
			}
		}
		
	}

}

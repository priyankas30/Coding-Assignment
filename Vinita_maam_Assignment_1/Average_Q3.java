package Vinita_maam_Assignment_1;

public class Average_Q3 {
	static class MIN_MAX{
		int min,max;
	}
	
	private static MIN_MAX getMinMax(int[] arr, int n) {
		
		MIN_MAX minmax=new MIN_MAX();
		if(n==1) {
			minmax.max=arr[0];
			minmax.min=arr[0];
			return minmax;
		}
		
		if(arr[0] > arr[1])
		{
			minmax.max=arr[0];
			minmax.min=arr[1];
		}
		else {
			minmax.max=arr[1];
			minmax.min=arr[0];
		}
		for(int i=2; i < n;i++) {
			if(arr[i] > minmax.max) {
				minmax.max=arr[i];
			}
				else if(arr[i] < minmax.min)
				{
					minmax.min=arr[i];
				}
			}
			return minmax;
			
		

		
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {1 ,345 ,234 ,21 ,56789};
		int arr_size=5;
		MIN_MAX minmax=getMinMax(arr,arr_size);
		System.out.println("minimum elemenet is "+minmax.min);
		System.out.println("maximum elemenet is "+minmax.max);
	}

	

}

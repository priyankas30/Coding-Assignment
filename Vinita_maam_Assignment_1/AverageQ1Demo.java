package Vinita_maam_Assignment_1;

public class AverageQ1Demo {
	static int binerySeach(int a[],int key,int n) {
		int left=0,right=n;
		int mid=0;
		while(left < right) {
			mid=(left + right) >> 1;
			if(a[mid] == key) {
				while(mid+1 < n && a[mid+1] == key)
				mid++;
				break;
			}
			else if(a[mid]> key)
				right=mid;
			else
				left =mid+1;
			}
		while(mid > -1 && a[mid] > key)
			mid--;
		return mid+1;
		
		
	}

	public static void main(String[] args) {
		int a[]= {1, 2, 2, 2, 5, 7, 9};
		int key=7;
		int n=a.length;
		System.out.println(binerySeach(a,key,n));

	}

}

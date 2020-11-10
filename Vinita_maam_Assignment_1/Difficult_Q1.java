package Vinita_maam_Assignment_1;

import java.util.Arrays;

public class Difficult_Q1 {

	public static void main(String[] args) {
		int M[][]={{2, 1, 4, 3},
				{1, 2, 3, 2},
				{3, 6, 2, 3},
				{5, 2, 5, 3}};
		int n=4;
		printDistinctElement(M,n);

	}
	public static void setRows(int M[][],int n) {
		for(int i=0;i<n;i++)
			Arrays.sort(M[i]);
	}

	private static void printDistinctElement(int M[][], int n) {
		// TODO Auto-generated method stub
		setRows(M, n);
		int curr_index[]=new int [n];
		int j=0;
		for(;curr_index[0] < n;curr_index[0]++) {
			
			int value =M[0][curr_index[0]];
			boolean ans=true;
			for(int i=1;i<n;i++) {
				
				while(curr_index[i] < n && M[i][curr_index[i]] <= value)
					curr_index[i]++;
				
				if(M[i][curr_index[i] - 1] != value)
					ans=false;
				if(curr_index[i]==n) {
					j=1;
					break;
				}
			}
			if(ans) {
				System.out.println(ans+" ");
			}
			if(j==1)
				break;
		}
		
	}

}

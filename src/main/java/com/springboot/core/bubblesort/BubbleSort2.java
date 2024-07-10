package com.springboot.core.bubblesort;

public class BubbleSort2 {

	// Sorting purpose
	public void BubbleSort(int[] arr) {
		 int n = arr.length;
		 
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (arr[j] > arr[j + 1]) {
	                    // swap arr[j+1] and arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
			}
	
	// printing purpose
	
	void PrintArray(int[] arr) {
		
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		int[] arr= {5,3,8,9,12,14,2,4,5,6,7,8};
		
		BubbleSort2 obj=new BubbleSort2();
		obj.BubbleSort(arr);
		System.out.println("Sorted Array: ");
		obj.PrintArray(arr);
	}
}

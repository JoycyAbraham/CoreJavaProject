
package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Printing Array elements: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Sorting Array elements");
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Printing Sorted Array elements: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
//		System.out.println("Linear Search...");
//		System.out.println("Enter element to search: ");
//		int search = sc.nextInt();
//		for(i=0;i<n;i++)
//		{
//			if(search==a[i])
//			{
//				System.out.println("Element " +search+" found at "+(i+1)+" position" );
//				break;
//			}
//			else
//			{
//				flag=0;
//			}
//		}
//		if(flag==0)
//		{
//			System.out.println(search+ " Element not found");
//		}
		System.out.println("Binary Search...");
		int low = 0;
		int high = n-1;
		int mid_index = (low+high)/2;
		
		System.out.println("Enter element to search: ");
		int search = sc.nextInt();
		for(i=0;i<n;i++) {
			//System.out.println(a[mid_index]);
			if(search==a[mid_index]) {
				System.out.println(a[mid_index]+ " Element found at position "+(mid_index+1));
				break;}
			else if(search>a[mid_index])
			{
				low=mid_index+1;
				mid_index = (low+high)/2;
			}
			
			else if(search<a[mid_index])
			{
				high = mid_index-1;
				mid_index = (low+high)/2;
			}
				
		}
		if(low>high)
			System.out.println(search + " Element not found");
		//Using Binary Search method..
		System.out.println("Using Binary Search method..");
		//String input = a.toString();
		String arr[]= {"Blue","Black","Pink","Red"};
		int b = Arrays.binarySearch(a, search);
		int str_pos = Arrays.binarySearch(arr, "White");
		System.out.println(search+" element found at position"+(b+1));
		System.out.println("White element found at position"+(str_pos+1));
	}
	
}

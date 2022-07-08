package com.java;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {23,45,6,4,67};
		int arr[] = new int[10];
		int arr1[][]=new int[2][2];
		int arr2[][]=new int[2][2];
		int res[][]=new int[2][2];
		Scanner sc = new Scanner(System.in);
//		//1-d Array
//		System.out.println("Enter numbers");
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("Array elements are: ");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		//2-d Array
		/*
		System.out.println("Enter numbers");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}*/
		//Addition of 2 arrays
		System.out.println("Enter numbers for array 1:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter numbers for array 2:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Array 1 elements are: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array 2 elements are: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition of 2 arrays: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				res[i][j] = arr1[i][j]+arr2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
//		System.out.println();
//		System.out.println("First element: " +a[0]);
//		int len = a.length;
//		System.out.println("Last Element: "+a[len-1]);
//		System.out.println("Length of Array: "+len);
//		
	}

}


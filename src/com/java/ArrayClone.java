package com.java;

import java.util.Arrays;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {23,43,65,78,2,11};
		//int b[] = a.clone();
		//int b[] = Arrays.copyOfRange(a, 2, 4);
		int b[] = Arrays.copyOf(a, 3);
		System.out.println("Array Elements are...");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}

package com.java;

import java.util.Scanner;

public class ArrayPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To print count of positive,negative and zero elements in 1-d Array...
		int cnt_p=0,cnt_n=0,cnt_z=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of 1-d Array");
		int length = sc.nextInt();
		int a[] = new int[length];
		System.out.println("Enter numbers: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				cnt_p++;
			}
			else if(a[i]==0)
			{
				cnt_z++;
			}
			else
				cnt_n++;
		}
		System.out.println("Count of Positives: "+cnt_p);
		System.out.println("Count of Negatives: "+cnt_n);
		System.out.println("Count of Zeros: "+cnt_z);
	}

}

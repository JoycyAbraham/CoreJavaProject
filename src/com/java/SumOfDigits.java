package com.java;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		
//		for (i=1;i<=num;i++)
//		{
//			sum = sum+i;
//			//System.out.println(sum);
//		}
		while(i<=num)
		{
			sum+=i;
			i++;
		}
		System.out.println("Sum of Digits: "+sum);
	}
}


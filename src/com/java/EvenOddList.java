package com.java;

import java.util.Scanner;

public class EvenOddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i+" is even");
			}
			else
				System.out.println(i+ " is odd");
		}
	}

}

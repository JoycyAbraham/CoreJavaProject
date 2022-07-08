package com.java;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 1 2 3 5 8 14
		int f1=0,f2=1,f3 = 0,n;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print("Fibonacci Series: "+f1+","+f2);
		for(int i=2;i<=n;i++)
		{
			f3 = f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(","+f3);
		}
		

	}

}

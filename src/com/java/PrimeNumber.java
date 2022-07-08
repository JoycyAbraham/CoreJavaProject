package com.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9, i, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
//		for (i = 2; i < num; i++) {
//			if (num % i == 0) {
//				flag = 0;
//				break;
//			} else {
//				flag = 1;
//				// continue;
//			}
//		}
		
		for(i=2;i<=num;i++)
		{
			for(int j=2;j<i;j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} 
				else {
					flag=1;
					// continue;
				}
		}
			if(flag==1)
				System.out.print(i+",");
		}
		System.out.println(" are prime numbers..");
	}

}

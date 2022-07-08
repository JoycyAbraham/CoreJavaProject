package com.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,rev_num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		while(num!=0)
		{
			rem = num%10;
			rev_num = (rev_num*10) + rem;
			num = num/10;
		}
		System.out.println("Reverse Number: "+rev_num);
		
	}

}

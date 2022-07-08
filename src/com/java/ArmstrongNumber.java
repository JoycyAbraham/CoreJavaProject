package com.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rem,rev_num=0,arms_number=0;
		int num,input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		input = num;
		//System.out.println(input);
		while(num!=0)
		{
			rem = num%10;
			arms_number = arms_number + Math.pow(rem,3);
			num = num/10;
		}
//		System.out.println("After..."+input);
//		System.out.println(arms_number);
		if(arms_number == input)
			System.out.println(input+ " is Armstrong number");
		else
			System.out.println(input + " is not Armstrong number");

	}

}

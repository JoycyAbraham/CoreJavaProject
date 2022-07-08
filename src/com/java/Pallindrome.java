package com.java;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check if pallindrome or not...");
		String input = sc.next();
		String str = input.toLowerCase();
		String pallin = "";
		int len = input.length();
		for (int i = len-1; i >= 0; i--) {
			pallin = pallin + input.charAt(i);
		}
		//System.out.println(input);
		if(str.equals(pallin.toLowerCase()))
			System.out.println(pallin + " is a pallindrome");
		else
			System.out.println(pallin+" is not a pallindrome");

	}

}

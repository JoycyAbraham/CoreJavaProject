package com.java;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+"is max");
		}
		else if(b>a && b>c) {
			System.out.println("Maximum is b: " + b);
		}
		else {
			System.out.println("Maximum is c: "+c);
		}
	}

}

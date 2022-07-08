package com.java;

import java.util.Scanner;

public class FindPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks M1, M2, M3");
		Scanner sc = new Scanner(System.in);
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double m3 = sc.nextDouble();
		System.out.println("Enter out of marks");
		double out_of = sc.nextDouble();
		double total = out_of*3; 
		//double avg = ((m1+m2+m3)/total);
		//System.out.println("Average" +avg);
		double per = ((m1+m2+m3)/total)*100;
		System.out.println("Percentage" + per);
		if(per>80)
			System.out.println("A grade");
		else if(per>60 && per<80)
			System.out.println("B Grade");
		else
			System.out.println("C Grade");
	}

}

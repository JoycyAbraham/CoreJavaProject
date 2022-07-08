package com.java;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
//		System.out.println("Left Triangle");
//		for(i=1;i<=n;i++)
//		{
//			for(j=0;j<i;j++)
//			{
//				System.out.print("*"+"\t");
//			}
//			System.out.println("\n");
//		}
		
		System.out.println("Simple Triangle");
		for(i=n;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(k=j;k<=n;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("\n");
		}
		System.out.println("Right Triangle");
		for(i=n;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("\t");
				
			}
			for(k=j;k<=n;k++)
			{
				System.out.print("*"+"\t");
			}
			System.out.println("\n");
		}
		
		
	}

}

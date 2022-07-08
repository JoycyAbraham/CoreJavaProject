package com.java;

import java.util.Scanner;

public class StringOperations_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt_letters=0,cnt_words=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		System.out.println("No of words: "+arr.length);
		System.out.println("Spaces: "+(arr.length-1));
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== ' ' && str.charAt(i+1)!=' ')
				cnt_words++;
			else if(str.charAt(i)!= ' ')
				cnt_letters++;
		}
		System.out.println("No of words: "+cnt_words);
		System.out.println("No of letters are "+cnt_letters);
		
	}
	

}

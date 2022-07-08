package com.java;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		System.out.println("To identify if string is empty or not.."+str.isEmpty());
		System.out.println("To identify if string is blank or not.."+str.isBlank());
		String s = "Java";
		String s1 = "JAVA";
		//return 0 if true else other numbers for false
		System.out.println("To compare two strings."+s.compareTo(s1));
		System.out.println("To compare two strings."+s.compareToIgnoreCase(s1));
		
		System.out.println("Starts With: "+s.startsWith("JA"));
		System.out.println("Ends with: "+s.endsWith("a"));
		
		String s2 = "     JAVA  is the bestt   ";
		System.out.println("Trim: "+s2.trim());
		System.out.println("Leading spaces: "+s2.stripLeading());
		System.out.println("Trailing spaces: "+s2.stripTrailing());
		System.out.println("Strip "+s2.strip());
		//repeat(0)--> str is not displayed
		System.out.println("Repeat.. "+s1.repeat(0));
		char []dest = new char[2];
		s1.getChars(1, 3,dest,0);
		System.out.println("Get Chars: "+Arrays.toString(dest));
		System.out.println(s1.toCharArray());
		//System.out.println("Char Array: "+s1.toCharArray());--> No working...
	}

}

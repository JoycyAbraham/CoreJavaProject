package com.java;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("I like Java");
		int length = s.length();
		System.out.println("UpperCase is: "+s.toUpperCase());
		System.out.println("LowerCase is: "+s.toLowerCase());
		boolean b = s.equalsIgnoreCase("i like java");
		System.out.println("Ignore Case: "+b);
		b = s.equals("i like java");
		System.out.println("Equals: "+b);
		System.out.println("Replace First something.."+s.replaceFirst("like", "love"));
		String str = new String("       I like like java");
		System.out.println("Replace First something.."+str.replaceFirst("like", "love"));
		System.out.println("Concat.."+s.concat(str));
		System.out.println("Contains.."+s.contains("like"));
		System.out.println("Substring... "+str.substring(4,6));
		System.out.println("Trim.. "+s.trim());
		System.out.println("Remove "+str.replaceFirst("like", ""));
	}

}

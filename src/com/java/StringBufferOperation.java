package com.java;

public class StringBufferOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default capacity of StringBuffer is 16...
//		StringBuffer sb = new StringBuffer("Hello Java");
//		sb.append(" Welcome!!");
//		System.out.println("Capacity is:"+sb.capacity());
//		System.out.println("After Append: "+sb);
//		System.out.println("Char At position 5: "+sb.charAt(5));
//		System.out.println("Reverse: "+sb.reverse());
//		System.out.println(sb.length());
//		System.out.println(sb.replace(0,3, "Something"));
//		System.out.println(sb.length());
		
		long startTime = System.currentTimeMillis();
		StringBuffer sbuffer = new StringBuffer("Hello");
		for(int i=0;i<1000;i++) {
			sbuffer.append("Java");
		}
		System.out.println("Timeconsumed by String Buffer: "+(System.currentTimeMillis()-startTime)+" milliseconds");
		startTime = System.currentTimeMillis();
		StringBuilder sbuilder = new StringBuilder("Tech");
		for(int i=0;i<1000;i++) {
			sbuilder.append("Learn  Java");
		}
		System.out.println("Time consumed by StringBuilder: "+(System.currentTimeMillis()-startTime)+" milliseconds");
	}
	

}

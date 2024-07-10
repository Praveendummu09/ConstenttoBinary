package com.prav.two;

public class UsingTricky {

	public static void main(String[] args) {
		int n=4;
		int rem,qut=n;
		String binary="";
		while(qut>0)
		{
			rem=qut%2;
			binary=Integer.toBinaryString(rem)+binary;
			qut=qut/2;
			
		}
		System.out.println(binary);

	}

}

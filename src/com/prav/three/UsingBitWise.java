package com.prav.three;

public class UsingBitWise {
	public static void bitwise(int n)
	{
		//assume you have a 32 bit of number
		for(int i=31;i>=0;i--)
		{
			int k=n>>i;
			if((k&1)>0)
			{
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n=5;
		bitwise(n);
		//Short-Cut
		String s=Integer.toBinaryString(12);
		System.out.println(s);
		int x=Integer.parseInt("10001", 2);
		System.out.println(x);

	}

}

/*Iteration 1: i = 31, k = 5 >> 31, k = 0, prints “0”.
…
Iteration 30: i = 2, k = 5 >> 2, k = 1, prints “0”.
Iteration 31: i = 1, k = 5 >> 1, k = 2, prints “1”.
Iteration 32: i = 0, k = 5 >> 0, k = 5, prints “1”.
*/
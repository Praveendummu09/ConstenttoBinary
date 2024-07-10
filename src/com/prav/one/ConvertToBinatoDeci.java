package com.prav.one;

public class ConvertToBinatoDeci {
	
	public static int binarytoDeci(int x)
	{
		int y=0;int digit=0;
		int i=0;
		while(x>0)
		{
			y=x%2;
			digit+=(y*Math.pow(2, i));
			x=x/10;
			i++;
			
		}
		
		
		return digit;
	}

	public static void main(String[] args) {
		int n=11;
		int result=binarytoDeci(n);
		System.out.println(result);
	}

}

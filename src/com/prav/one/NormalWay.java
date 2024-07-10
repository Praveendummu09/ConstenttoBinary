package com.prav.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NormalWay {
	
	public static void binary(int n)
	{
		List<Integer> list=new ArrayList<Integer>();
		while(n>0)
		{
			list.add(n%2);
			n=n/2;
		}
		/*
		 * for(int i=list.size()-1;i>=0;i--) { System.out.print(list.get(i)); }
		 */
		
		Collections.reverse(list);
		System.out.println(list);
	}

	public static void main(String[] args) {
		int n=6;
		System.out.println("Decimal no: "+n);
		binary(n);

	}

}

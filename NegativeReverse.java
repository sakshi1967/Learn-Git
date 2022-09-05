package com.basic;

public class NegativeReverse {
	public static void main(String[] args) {
		int num = -12345;
		boolean isNegative = num < 0 ? true : false ;
		
		if(isNegative)
		{
			System.out.print("-");
			num = num * -1;
			
		}
		getReverse(num);
    }

	private static void getReverse(int num) {
		
		if(num == 0)
			return;
		
		int rem = num % 10;
		System.out.print(rem);
		
		getReverse(num / 10);
		
	}

	
}
//using recusrsion

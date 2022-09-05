package com.basic;

public class SumOfGiven {
	public static void main(String[] args) {
		int num =12345, sum = 0;
		System.out.println("The sum of the given number is : " + getSum(num , sum ) );
    }

	private static int getSum(int num, int sum) {
		if(num == 0 )
			return sum;
		
		sum += num % 10 ;
		return getSum(num / 10, sum);
	}
}
//using recusrsion

package day6practice;

import java.util.Scanner;

public class PerNum {

	public static void main(String[] args) {
		long num, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");  
		num = sc.nextLong();
		int i=1;
		
		while(i<=num/2)
		{	
		if(num % i == 0)
		{ 
			sum = sum + i;
		}	i++;
		}
		if(sum==num)  
		{  
		 System.out.println(num+" is a perfect number.");  
		}
		else {  
		System.out.println(num+" is not a perfect number.");   	
		}
	}
}

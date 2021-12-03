package day5practice;

import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		
		int num1,num2,num3,largest;
		int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		num2 = sc.nextInt();
		System.out.println("Enter num3: ");
		num3 = sc.nextInt();
		
		largest= num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2); 
		System.out.println("Largest Number is: " + largest);
		
		for(sum=0; largest!=0; largest=largest/10)  
		{  
		//finds the last digit and add it to the variable sum      
		sum = sum + largest % 10;  
		}  
		//prints the result  
		System.out.println("Sum of digits: "+sum);  
	
	}

}

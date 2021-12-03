package day5practice;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
	
	int num = 10;
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);	
	num = sc.nextInt();
    
    //Finding even or odd
    if (num % 2 == 0){
       System.out.println(num+ " is an even number");
    } else {
       System.out.println(num+ " is an odd number");
    }
}
}

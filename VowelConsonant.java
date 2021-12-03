package day5practice;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char chr = sc.next().charAt(0);
		
		if( chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' || chr == ' ') {
			System.out.println("Character is vowel");
	} else
			System.out.println("Character is consonant");
	}

}

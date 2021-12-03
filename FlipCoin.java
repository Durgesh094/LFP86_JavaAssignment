package day5practice;

import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//args r = new args();
		
		if (Math.random() < 0.5){
			System.out.println("Heads");
			}else{
			System.out.println("Tails");
			}
		
		  int user;
		  int answer = sc.nextInt(2)+1;
		  int quit = -1;
		  int Guess = 0;
		  int percent;
		 
		  do {
			    System.out.println("1 for head and 2 for tails:");
			    user = sc.nextInt();
			    Guess += 1;
			    System.out.println("Type in 1 for heads and Type 2 for Tails.");
			    System.out.println("Press" +" "+ (quit) +" "+ "to Quit.");
			    answer = sc.nextInt(2)+1;
			     int HEAD = 1;
			     int TAIL = 2;
			    if (user == answer)
			    System.out.println("You win!");
			    else if (user != answer)
			      System.out.println("Try again!");
			      percent = ((HEAD/TAIL)*100);
		  }
		  while (user != -1);
		    System.out.println("You made" +" "+ Guess +" "+ "guess");
		      System.out.println("You Quit!");
		      System.out.println(percent+"Percent"); 
		
	}
}

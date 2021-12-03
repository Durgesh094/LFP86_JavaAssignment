package day6practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num =20, count;
		int i,j;
		System.out.println("Enter Number: ");
		
		for(i=0;i<=num;i++) {
		count = 0;
			for(j=0;j<=i/2;j++) {
				if (i%j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
			    System.out.println(i);
		}
	}
}
}


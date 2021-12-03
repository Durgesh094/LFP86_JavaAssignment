package day5practice;

public class PowerOf2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int i = 0;
		int powerof2 = 1; 
		
		while(i<=n) {
			System.out.println(i + "" + powerof2);
			powerof2 = 2 * powerof2;
			
			i=i+1;
		}

	}

}

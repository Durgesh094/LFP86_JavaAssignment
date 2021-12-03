package day6practice;

public class CouponNumber {

	public static void main(String[] args) {
		char[] chars="abcdefghijABCDEFGHIJ12345678910".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sc = new StringBuffer();
		
		while (random>0)
		{
			sc.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponNumber=sc.toString();
		System.out.println("Coupon Code: "+couponNumber);	

	}
}

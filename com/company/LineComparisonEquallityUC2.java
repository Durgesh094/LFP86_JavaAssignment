package com.company;

import java.util.Scanner;

public class LineComparisonEquallityUC2 {
	public static void main(String[] args) {
		String x1, x2, y1, y2;
		double p1, p2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x1: ");
		x1 = sc.next();
		System.out.println("Enter y1: ");
		y1 = sc.next();
		System.out.println("Enter x2: ");
		x2 = sc.next();
		System.out.println("Enter y2: ");
		y2 = sc.next();
		

		System.out.println("expect1: " + x1.equals(x2));
		System.out.println("expect2: " + y1.equals(y2));

		if (x1.equals(x2) && y1.equals(y2)) {
			System.out.println("Two lines have equal lenght");
		} else {
			System.out.println("Two lines does not have equal lenght");
		}

	}
}

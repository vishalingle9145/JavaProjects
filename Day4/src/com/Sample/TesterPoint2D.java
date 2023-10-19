package com.Sample;

import java.util.Scanner;

public class TesterPoint2D {

	public static void main(String[] args) {

		int choice;
		int index = 0;

		Scanner sc = new Scanner(System.in);

//		Point2D obj1 = new Point2D(123456, 987456);
//		Point2D obj2 = new Point2D(10001, 20001);

//		System.out.println(obj1);

		Point2D[] ptarr = new Point2D[5];


		System.out.println("1.Show All\n2.Add New\n3.Exit");

		System.out.println("enter your choice : ");
		choice = sc.nextInt();


// this is point2D class for testing point2D class

		while (choice != 3) {

			switch (choice) {

			case 1: {
				
					for (Point2D pt : ptarr) {
						System.out.println(pt);
					}
				break;
			}
			case 2: {
				if (index < ptarr.length) {
					
					System.out.println("Enter Value of X: ");
					int x = sc.nextInt();
					
					System.out.println("Enter Value of Y: ");
					int y = sc.nextInt();

					ptarr[index] = new Point2D(x, y);
					index++;

				}
			}
			}

			System.out.println("enter your choice : ");
			choice = sc.nextInt();

		}

	}

}

package com.cart.app;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Business b = new Business();

		do {
			System.out.println("Enter 1 to add book");
			System.out.println("Enter 2 to display books");
			System.out.println("Enter 3 to buy books");
			System.out.println("Enter 4 to check out");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				b.addBooks();
				break;
			case 2:
				b.display();
				break;
			case 3:
				b.buyBooks();
				System.out.println("purchased books");
				b.displayBuyBooks();
				break;
			case 4:
				b.checkOut();
				break;
			}

		} while (choice < 5);
	}

}

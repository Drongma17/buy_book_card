package com.cart.app;

import java.util.Iterator;

public class Business extends CartUtil implements Cart {

	public void addBooks() {
		b = new Book();
		System.out.println("Enter book id");
		b.id = sc.nextInt();
		System.out.println("Enter Book name");
		b.name = sc.next();
		System.out.println("Enter Book cost");
		b.cost = sc.nextDouble();
		books.add(b);
		System.out.println("Book added");

	}

	public void display() {
		Iterator i1 = books.iterator();
		System.out.println("Id\t\tName\t\tCost");
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

	public void displayBuyBooks() {
		Iterator i2 = buyBooks.iterator();
		System.out.println("Id\t\tName\t\tCostperbook\t\tCount\t\tTotalCost");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

	public void buyBooks() {
		int ch;
		do {
			System.out.println("Enter book id which you want to buy");
			bookId = sc.nextInt();
			int temp = 0;
			Book b1;
			// PurchasedBook b2;
			Iterator i1 = books.iterator();
			while (i1.hasNext()) {
				b1 = (Book) i1.next();
				if (b1.id == bookId) {
					/* buyBooks.add(b1); */
					Iterator i2 = buyBooks.iterator();
					while (i2.hasNext()) {
						b2 = (PurchasedBook) i2.next();
						if (b2.id == bookId) {
							b2.count++;
							b2.totalCost = b2.count * b2.cost;
							temp = 1;
						}
					}

					if (temp == 0) {
						b2 = new PurchasedBook();
						b2.id = b1.id;
						b2.cost = b1.cost;
						b2.name = b1.name;
						b2.totalCost = b1.cost;
						b2.count++;
						buyBooks.add(b2);

					}

				}
			}

			System.out.println("Do you want buy some more books");
			System.out.println("if yes then press 1");
			System.out.println("if no then press 0");
			ch = sc.nextInt();
		} while (ch == 1);

	}

	public void checkOut() {
		displayBuyBooks();
		total = 0;
		Iterator i2 = buyBooks.iterator();
		while (i2.hasNext()) {
			b2 = (PurchasedBook) i2.next();
			total = total + b2.totalCost;

		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Total\t\t\t\t\t\t\t\t\t" + total);

	}
}

package com.cart.app;

public interface Cart {
	//For Admin to add books to db
	void addBooks();
	//To display availabe books to user
	void display();
	//To purchase books by user
	void buyBooks();
	
	void checkOut();

}

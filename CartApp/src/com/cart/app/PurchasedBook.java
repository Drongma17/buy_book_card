package com.cart.app;

public class PurchasedBook implements Comparable {

	int id;
	String name;
	double cost;
	int count;
	double totalCost;

	@Override
	public String toString() {
		return id + "\t\t" + name + "\t\t" + cost + "\t\t\t" + count + "\t\t" + totalCost;
	}

	/*
	 * public int hashCode() { return this.id; }
	 * 
	 * public boolean equals(Object arg) { return this.hashCode() ==
	 * arg.hashCode(); }
	 */

	@Override
	public int compareTo(Object arg0) {
		Book b1 = (Book) arg0;
		return (this.id - b1.id);
	}

}

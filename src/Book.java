import java.io.*;
import java.util.*;

public class Book implements Serializable{

	static final long serialVersionUID = 44L;
	
	private String title;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String title, Author author,double price) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		qtyInStock = 0;
	}
	
	public Book(String title, Author author,double price,int qtyInStock) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public static Book readFromKeyboard(Scanner input) {
		String title;
		Author author;
		double price;
		int qtyInStock;
		
		System.out.println("Enter the title of the book: ");
		title = input.nextLine();
		//Author
		author = Author.readFromKeyboard(input);
		System.out.println("Enter the price of the book: ");
		price = input.nextDouble();
		System.out.println("Enter the stock: ");
		qtyInStock = input.nextInt();
		
		Book b = new Book(title, author, price, qtyInStock);
		return b;
	}
	
	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		return title + " by " + author.toString();
	}
	
}

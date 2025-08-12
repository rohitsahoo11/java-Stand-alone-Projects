package com.collection.assignment1;
import java.util.*;
public class Library{
	
	public Book books;
	
	public void displayAvailableBooks(Vector<Book> books) {
		books.forEach(System.out::println);
	}
	
	public void issueBook(Vector<Book> books, Scanner sc) {
		
		System.out.print("Enter the book id: ");
		int id = sc.nextInt();
		boolean found = false;
		
		Iterator<Book> it = books.iterator();
	    while (it.hasNext()) {
	        Book i = it.next();
	        if (i.id() == id) {
	            System.out.println("Issued: " + i);
	            it.remove();  // Safe removal using iterator
	            found = true;
	            break; // Optional: stop after issuing one book
	        }
	    }

		if(found==false) {
			System.out.println("Book not found...");
		}
		
		
		
	}
	
	public void searchBook(Vector<Book> books, Scanner sc) {
		System.out.print("Search by Keyword: ");
		String name = sc.next();
		
		boolean found = false;
		for(Book i:books) {
			if(i.title().equalsIgnoreCase(name) || i.author().equalsIgnoreCase(name)) {
				System.out.println("Book Found: "+i);
				found = true;
			}
			
		}
		if(found==false) {
			System.out.println("Book not found...");
		}
	}
	
}

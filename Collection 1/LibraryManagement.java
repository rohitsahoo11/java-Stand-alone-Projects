package com.collection.assignment1;
import java.util.*;
public class LibraryManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		
		Vector<Book> books = new Vector<Book>();
		books.add(new Book(111, "CHI", "Hoho"));
		books.add(new Book(222, "CHU", "HohU"));
		books.add(new Book(333, "CHO", "HohI"));
		books.add(new Book(444, "CHY", "HohP"));
		books.add(new Book(555, "CHA", "HohT"));
		
		
		
		System.out.println("Select from the Menu :\r\n"
				+ "	 1) Display Books Available in the Library :\r\n"
				+ "	 2) Search a Book in the Library :\r\n"
				+ "	 3) Issue a Book from the Library :\r\n"
				+ "	 4) Exit from the application :\r\n"
				+ "");
		
		System.out.print("Please Enter your Choice : ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println("Available Books in the Library : ");
			lib.displayAvailableBooks(books);
			
		}
		case 2: {
			lib.searchBook(books, sc);
		}
		case 3: {
			lib.issueBook(books, sc);
			books.forEach(System.out::println);
		}

	}
	}
}

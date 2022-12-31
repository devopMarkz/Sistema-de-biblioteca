package application;

import bookArchiveSearch.BookArchiveSearchService;
import library.Book;
import library.Library;

public class Program {

	public static void main(String[] args) {
		
		Library l = new Library(new BookArchiveSearchService());
		
		for (Book book : l.getBookList()) {
			System.out.println(book);
		}

	}

}

package library;

import java.util.ArrayList;
import java.util.List;

import bookArchiveSearch.FileSearchService;

public class Library {
	
	private List<Book> bookList = new ArrayList<>();
	
	public Library() {
	}
	
	public Library(FileSearchService searchBooks) {
		this.bookList = searchBooks.getBookListFile();
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	

}

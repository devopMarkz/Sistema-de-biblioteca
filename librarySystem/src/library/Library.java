package library;

import java.util.ArrayList;
import java.util.List;

import library.services.FileSearchService;
import libraryAccessSystem.searchBooksServices.SearchBooksInLibraryService;

public class Library implements SearchBooksInLibraryService{
	
	private List<Book> bookList = new ArrayList<>();
	
	public Library() {
	}
	
	public Library(FileSearchService searchBooks) {
		if (searchBooks.getBookListFile().isEmpty()) throw new IllegalArgumentException("A lista não contém elementos");
		this.bookList = searchBooks.getBookListFile();
	}

	@Override
	public List<Book> getBookList() {
		return bookList;	
	}

}

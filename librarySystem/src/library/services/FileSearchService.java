package library.services;

import java.io.File;
import java.util.List;

import library.Book;

public interface FileSearchService {
	
	default File getFile() {
		return FileStorageService.bookListFile;
	}
	
	List<Book> getBookListFile();

}

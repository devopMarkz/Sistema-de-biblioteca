package utilities;

import java.util.List;

import library.Book;

public class PrintListService {
	
	public static void printList(List<? extends Book> lista) {
		for (Book book : lista) {
			printBookInformation(book);
		}
	}
	
	public static void printBookInformation(Book book) {
		String rented = (book.getRented() == false)? "LIVRO DISPONÍVEL" : "LIVRO ALUGADO";
		System.out.println(book.getTitle() + ", " + rented);
	}

}

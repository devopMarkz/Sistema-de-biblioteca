package studentEntities;

import library.Book;

public class Student {
	
	private Book book;
	
	private Invoice invoice;
	private Register register;
	
	// Construtores da classe
	
	public Student() {
	}
	
	public Student(Register register) {
		this.register = register;
	}
	
	// Getters e setters
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	// Métodos da classe
	
	@Override
	public String toString() {
		return "ID: " + register.getId()
				+ ", Book: " + book.getTitle()
				+ ", Invoice: " + String.format("R$%.2f", invoice.getBookRentalPrice());
	}

}

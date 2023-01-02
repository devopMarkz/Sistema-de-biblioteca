package studentEntities;

public class Invoice {
	
	private Double bookRentalPrice;
	
	// Construtores da classe
	
	public Invoice() {
	}

	public Invoice(Double bookRentalPrice) {
		this.bookRentalPrice = bookRentalPrice;
	}

	// Getters e setters
	
	public Double getBookRentalPrice() {
		return bookRentalPrice;
	}

	public void setBookRentalPrice(Double bookRentalPrice) {
		this.bookRentalPrice = bookRentalPrice;
	}
	

}

package libraryAccessSystem.invoiceServices;

import java.time.Duration;
import java.time.LocalDate;

public class LibrarySystemFeeService implements FeeService {

	@Override
	public Double getFee(LocalDate rentDate, LocalDate returnDate) {
		Long days = Duration.between(rentDate.atStartOfDay(), returnDate.atStartOfDay()).toDays();
		Double fee = (days - 7) * 3.0;
		
		if (fee <= 0) return 0.0;
		return fee;
	}
	
	

}

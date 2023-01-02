package libraryAccessSystem.validationServices;

import java.util.ArrayList;
import java.util.List;

import libraryAccessSystem.logCheckingServices.RegisterSearchService;
import studentEntities.Register;
import studentEntities.Student;

public class AccessValidationServiceOnLibrarySystem implements AccessValidationService {
	
	private List<Register> studentRegistrationList = new ArrayList<>();
	
	// Construtores da classe
	
	public AccessValidationServiceOnLibrarySystem() {
	}

	public AccessValidationServiceOnLibrarySystem(RegisterSearchService registrationList) {
		this.studentRegistrationList = registrationList.getStudentRegister();
	}
	
	// Getters e setters

	public List<Register> getStudentRegistrationList() {
		return studentRegistrationList;
	}
	
	// Métodos da classe

	@Override
	public Student giveStudentAccess(String id, String password) {
		for (Register register : studentRegistrationList) {
			if (register.getId().equals(id) && register.getPassword().equals(password)) {
				return new Student(new Register(id, password));
			}
		}
		return null;
	}

}

package libraryAccessSystem.validationServices;

import studentEntities.Student;

public interface AccessValidationService {
	
	Student giveStudentAccess(String id, String password);

}

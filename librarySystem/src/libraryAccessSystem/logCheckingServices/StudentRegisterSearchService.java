package libraryAccessSystem.logCheckingServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import studentEntities.Register;

public class StudentRegisterSearchService implements RegisterSearchService{

	@Override
	public List<Register> getStudentRegister() {
		try (Scanner readFiles = new Scanner(new BufferedReader(new FileReader(getFileOfStudentRegistration())))){
			List<Register> studentRegister = new ArrayList<>();
			
			while (readFiles.hasNextLine()) {
				String[] fields = readFiles.nextLine().split(",");
				
				studentRegister.add(new Register(fields[0], fields[1]));
			}
			return studentRegister;
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Error: Talvez haja uma linha em branco no seu arquivo!");
			e.printStackTrace();
		}
		return null;
	}
	
	

}

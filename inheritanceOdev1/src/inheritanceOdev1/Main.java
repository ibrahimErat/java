package inheritanceOdev1;

public class Main {

	public static void main(String[] args) {
	
		Instructr instructr = new Instructr();
		instructr.setId(1);
		instructr.setFirsName("Engin");
		instructr.setLastName("Demiroğ");
		instructr.seteMail("engindemiroğ80@gmail.com");
		instructr.setPassword("123456789");
		instructr.setUserID("00000");
		
		
		
		Student student = new Student();
		student.setId(2);
		student.setFirsName("ibrahim");
		student.setLastName("Erat");
		student.seteMail("ibrahimerat80@gmail.com");
		student.setPassword("987654321");
		student.setSchool("Makbule Efe Anandolu Lisesi");
		
		
		InstructrManager instructrManager = new InstructrManager();
		instructrManager.add(instructr);
		
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.courseClassSelection(student);
			


	}
	

}

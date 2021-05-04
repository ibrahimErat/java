package entities;

import java.time.LocalDate;
import abstracts.IEntity;


public class  Customer implements IEntity {

	int id;
	String firstName;
	String listName;
    String identityNumber;
    LocalDate birthDate;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String listName, String identityNumber, LocalDate localDate) {
	    super();
		this.id = id;
		this.firstName = firstName;
		this.listName = listName;
		this.identityNumber = identityNumber;
		this.birthDate = localDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	
}

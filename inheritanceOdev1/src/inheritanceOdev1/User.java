package inheritanceOdev1;

public class User {

	private int id;
	private String firsName;
	private String lastName;
	private String eMail;
	private String password;
	
	
    public User() {
		
	}
	
	public User(int id, String firsName, String lastName, String eMail, String password) {
		this();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

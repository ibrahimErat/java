package inheritanceOdev1;

public class UserManager {

	public void logIn(User user) {
		
		System.out.println(user.getFirsName() + " : Giriş Yapıldı");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirsName() + " :  Çıkıi Yapıldı");
		
	}
}

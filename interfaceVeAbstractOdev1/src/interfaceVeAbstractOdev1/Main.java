package interfaceVeAbstractOdev1;

import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import concrete.StarbucksCustomerManger;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
	
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManger(new CustomerCheckService() {
			
			@Override
			public boolean CheckIfRealPerson(Customer customer) {
				// TODO Auto-generated method stub
				return false;
			}
		
			
			
		});
		
		baseCustomerManager.save(new Customer(1,"İbrahim", "Erat", "10544782652",LocalDate.of(2003, 11, 8)));

		
		
	}

}

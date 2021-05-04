package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManger extends BaseCustomerManager  {

	private CustomerCheckService customercheckservice;
	
	
	public StarbucksCustomerManger(CustomerCheckService customercheckservice) {
		
		this.customercheckservice = customercheckservice;
		
	}


	@Override
	public void save(Customer customer) {
		if(customercheckservice.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks veri tabanına kaydedildi" + customer.getFirstName() + customer.getListName());
			
		}else {
			System.out.println("veri tabanına uyumlu değil");
		}
			
		
		
		
		
	}

   
	
}

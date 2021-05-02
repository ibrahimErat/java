package inheritanceMiras;

public class CustomerManager {

	
	public void add(Customer customer) {
		System.out.println(customer.costumerNumber + " kaydedildi");
		
	}
	
	public void addMultiple (Customer[] customers) {
		
		for(Customer customer : customers ) {
			     add(customer);
			
		}
		     
	}
	
}

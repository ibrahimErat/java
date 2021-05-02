package inheritanceMiras;

public class Main {

	public static void main(String[] args) {
	
	    IndividualCustomer ibrahim = new IndividualCustomer();
	    ibrahim.costumerNumber= "1234";
	    
	    
	    CorporoteCustomer hepsiburada = new CorporoteCustomer();
		hepsiburada.costumerNumber= "5678";
		
		
		 CustomerManager customerManager = new CustomerManager();
		 
		 Customer[] customers = {ibrahim,hepsiburada};
		 
		 customerManager.addMultiple(customers);
		 
		
	}

	    
}

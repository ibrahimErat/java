package oppIntro;

public class Main {

	public static void main(String[] args) 
	{
		Product product1 = new Product(1, "Macbook", 15000, "8 gb ram", 10);  //--->örnek oluşturma sistemin tanıması için tanıtılır
		
		
		Product product2 = new Product(); 
	    product2.setId(2);
	    product2.setName("Monster");
	    product2.setUnitPrice(14000);
	    product2.setDetail("16 gb ram");
	    product2.setDiscount(10);
	  
		
		Product product3 = new Product();  
	
	    
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("yiyecek");
	
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("içecek");
	
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}

}

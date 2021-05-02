package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//camelCase - yazım kuralı
		
      String internetSubeButonu = "İnternet Şubesi";
      
		double dolarDun = 8.15;
		
		double dolarBugun = 8.15;
		
		int faizOranı = 36;
		
		Boolean dolarDustuMu = true;
		
		
      System.out.println(internetSubeButonu);
      
      if (dolarBugun<dolarDun) 
      {
		System.out.println("dolar düştü resmi");
    	  
	  }
      
      else if (dolarBugun>dolarDun) 
      {
    	  System.out.println("dolar yükseldi resmi");
      }
      
      else 
      {
    	  System.out.println("dolar eşit resmi");
	  }
      
      
      System.out.println("---------------Array-diziler-----------------");
      
     String kredi1 = "hızlı kredi";
     String kredi2 = "mutllu emekli kredisi";
     String kredi3 = "çiftçi kredisi";
     String kredi4 = "yaşam kredisi";
     String kredi5 = "meb kredisi";
     
     
     System.out.println(kredi1);
     System.out.println(kredi2);
     System.out.println(kredi3);
     System.out.println(kredi4);
     System.out.println(kredi5);
    
     
     System.out.println("------foreach-----doğrusu-----------");
          
     String[] krediler = {"hızlı kredi","mutllu emekli kredisi","çiftçi kredisi","yaşam kredisi","meb kredisi"};
    		 
    	//foreach	 
     for (String kredi : krediler ) {
    	 
    	 System.out.println(kredi);
    	
     }
     
     System.out.println("--------classic for-----------");
     //classic for
     for (int i = 0; i <krediler.length; i++) {
    	 
    	 System.out.println(krediler[i]);
     }
     System.out.println("---------------değer ve referans tipler-------------------");
     
     //değer tip
     int sayı1 = 10;
     int sayı2 = 20;
     sayı1 = sayı2;
     sayı2 = 99;
     System.out.println(sayı1);
     
     //referans tip
     int[] sayılar1 = new int[] {10, 20, 30, 40}; 
     int[] sayılar2 = new int[] {100, 200, 300, 400};
     sayılar1 = sayılar2;
     sayılar2[0] =999;
     System.out.println(sayılar1[0]);
     
     
     
   }

}

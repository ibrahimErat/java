package MernisServiceAdapter;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
     KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
    		
     boolean result = true;
     
     try {
    	 result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long. parseLong(customer.getIdentityNumber()), customer.getFirstName().toUpperCase(), customer.getListName().toUpperCase(), customer.getBirthDate().getYear());
     } catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
     
	 return result;
	}
	 return true;
     
  }

}	

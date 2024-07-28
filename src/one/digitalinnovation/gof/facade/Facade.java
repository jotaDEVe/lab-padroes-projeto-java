package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

	public void migrateCustomer(String name, String cep) {
		String city = CepApi.getInstance().recoverCity(cep);
		String state = CepApi.getInstance().recoverState(cep);
		
		CrmService.saveCustomer(name, cep, city, state);
	}
}

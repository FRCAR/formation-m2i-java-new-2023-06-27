import com.bigcorp.project.data.contract.AddressService;
import com.bigcorp.project.data.repository.AddressServiceImpl;

/**
 * Ce module propose des services pour accéder au référentiel 
 * de données ...
 * @provides AddressService
 */
module com.bigcorp.project.data.repository{
	
	requires transitive com.bigcorp.project.data.contract;
	
	//Utile pour gérer les utilisateurs
	exports com.bigcorp.project.data.model;
	exports com.bigcorp.project.data.repository;
	opens com.bigcorp.project.data.model to com.bigcorp.project.graphics;
	
	provides AddressService with AddressServiceImpl;	
	
}
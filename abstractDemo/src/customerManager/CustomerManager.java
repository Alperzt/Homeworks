package customerManager;

import dataBaseManager.BaseDataBaseManager;

public class CustomerManager {
	private BaseDataBaseManager baseDataManager;
	
	public CustomerManager(BaseDataBaseManager baseDataManager) {
		super();
		this.baseDataManager = baseDataManager;
	}

	public void getCustomer() {
		baseDataManager.getData();
		
	}
}

package manager;

import dal.ICustomerDal;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	public void customerAdd() {
		customerDal.add();
	}
}

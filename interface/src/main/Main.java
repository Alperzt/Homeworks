package main;

import dal.OracleCustomerDal;
import manager.CustomerManager;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.customerAdd();
		
	}

}

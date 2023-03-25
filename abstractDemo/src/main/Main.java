package main;

import customerManager.CustomerManager;
import dataBaseManager.OracleDataBaseManager;
import dataBaseManager.SqlDataBaseManager;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleDataBaseManager());
		customerManager.getCustomer();
	}

}

package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DataBaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.IProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1,"Iphone",9000);
		
		Logger[] loggers = {new DataBaseLogger(),new FileLogger()};
		IProductDao hibernateDao = new HibernateProductDao();
		IProductDao jdbcDao = new JdbcProductDao();
		ProductManager productManager = new ProductManager(product1,hibernateDao,loggers);
		ProductManager productManager1 = new ProductManager(product1, jdbcDao, loggers);
		productManager1.add();
		System.out.println("-------------");
		productManager.add();
	}

}

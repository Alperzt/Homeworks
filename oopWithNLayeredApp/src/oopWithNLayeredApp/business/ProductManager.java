package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.IProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private IProductDao productDao;
	private Logger[] loggers;
	private Product product;
	
	public ProductManager(Product product,IProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
		this.product = product;
	}

	public void add() throws Exception {
		// iş kurallar
		if(product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10'dan küçük olamaz");
		}
		
		productDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}
}

package polymorphismDemo;

import polymorphismDemo.Logger.BaseLogger;
import polymorphismDemo.Logger.DataBaseLogger;
import polymorphismDemo.Logger.EmailLogger;
import polymorphismDemo.Logger.FileLogger;
import polymorphismDemo.business.CustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DataBaseLogger(), new EmailLogger()}; 
		for(BaseLogger logger : loggers ) {
			logger.log("Log mesajı");
		}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
